package com.example.appfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;


public class DateTimeCalActivity extends AppCompatActivity implements View.OnClickListener{

    DatePicker dp;
    TimePicker tp;
    TextView tv;
    Button btnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_cal);


        dp = findViewById(R.id.datepickerBirthday);
        tp = findViewById(R.id.timepickerAlarmTime);
        tv = findViewById(R.id.lblResultDateTime);
        btnr = findViewById(R.id.btnRead);
        btnr.setOnClickListener(this);
    } // end onCreate()

    @Override
    public void onClick(View v)
    {
        int d = dp.getDayOfMonth();
        int m = dp.getMonth() + 1;
        int y = dp.getYear();

        int hr = tp.getHour();
        int min = tp.getMinute();

        String msg = "You picked date: " + d + "/" + m + "/" + y + "\nYou picked time: " + hr + ":" + min;

        tv.setText(msg);

    } // end onClick


}