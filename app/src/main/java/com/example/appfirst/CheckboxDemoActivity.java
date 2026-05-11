package com.example.appfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckboxDemoActivity extends AppCompatActivity
{
    CheckBox c1, c2, c3;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_demo);

        c1 = findViewById(R.id.chkGroceries);
        c2 = findViewById(R.id.chkHomework);
        c3 = findViewById(R.id.chkExercise);
        t = findViewById(R.id.lblResult);
    } // end onCreate()

    public void onSaveClick(View v)
    {
        String msg = "You have done the following tasks:";

        if( c1.isChecked() )
            msg += "\nGroceries";

        if( c2.isChecked())
            msg += "\nHomework";

        if( c3.isChecked())
            msg += "\nExercise";

        t.setText(msg);

        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
    } // end onSaveClick()


}