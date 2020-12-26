package com.stubborn.comparingtwodates;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.text.ParseException;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        // Get Current Date Time
//        Calendar c = Calendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm aa");
//        String getCurrentDateTime = sdf.format(c.getTime());
//        String getMyTime = "05/19/2026 09:45 PM ";
//        Log.d("getCurrentDateTime", getCurrentDateTime);
//// getCurrentDateTime: 05/23/2016 18:49 PM
//
//        if (getCurrentDateTime.compareTo(getMyTime) < 0) {
//            Toast.makeText(this, "CurrentDateTim is older than getMyTime", Toast.LENGTH_LONG).show();
//        } else {
//            Log.d("Return", "getMyTime older than getCurrentDateTime ");
//            Toast.makeText(this, "getMyTime older than getCurrentDateTime", Toast.LENGTH_LONG).show();
//
//        }



        String date = "03/26/2012 11:00:00";
        String dateafter = "03/26/2012 11:59:00";
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "MM/dd/yyyy hh:mm:ss");
        Date convertedDate = new Date();
        Date convertedDate2 = new Date();
        try {
            convertedDate = dateFormat.parse(date);
            convertedDate2 = dateFormat.parse(dateafter);
            if (convertedDate2.after(convertedDate)) {
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
