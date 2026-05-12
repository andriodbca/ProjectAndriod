package com.example.appfirst;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn3;
    Button btnImg;

    Button btnDateTime;
    Button btnDemoRawFiles;
    Button btnDBExample1;
    Button btnDBExample2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn3 = findViewById(R.id.btnShowMessage1);
        btn3.setOnClickListener(this);

        btnImg = findViewById(R.id.btnDemoImageView);
        btnImg.setOnClickListener(this);

        btnDateTime = findViewById(R.id.btnDemoDateTimePickers);
        btnDateTime.setOnClickListener(this);

        btnDemoRawFiles = findViewById(R.id.btnDemoRawFiles);
        btnDemoRawFiles.setOnClickListener(this);

        btnDBExample1 = findViewById(R.id.btnDBExample1);
        btnDBExample1.setOnClickListener(this);

        btnDBExample2 = findViewById(R.id.btnDBExample2);
        btnDBExample2.setOnClickListener(this);
    }//end onCreate()



    public void handleOpenCalc(View v)
    {
        Button b = (Button) v;
        b.setText("Calculator is starting...");

        Intent i = new Intent(this, CalculatorActivity.class );
        startActivity(i);
    } // end handleOpenCalc()

    public void handleOpenWebsite(View v)
    {
        Uri u = android.net.Uri.parse("https://gdcpulwama.edu.in");

        Intent i = new Intent( Intent.ACTION_VIEW );
        i.setData(u);

        startActivity(i);

    } // end handleOpenWebsite()

    @Override
    public void onClick(View v)
    {
        if( v == btn3)
        {
            int price = 25596;
            //btn3.setText("This works...");
            Toast.makeText(this, "You are learning android programming for " + price + " INR", Toast.LENGTH_SHORT).show();
        }
        else if ( v == btnImg)
        {
            Intent i = new Intent(this, ImageActivity.class);
            startActivity(i);
        }
        else if( v == btnDateTime)
        {
            Intent i = new Intent(this, DateTimeCalActivity.class);
            startActivity(i);
        }
        else if( v == btnDemoRawFiles)
        {
            Intent i = new Intent(this, Files1Demo.class);
            startActivity(i);
        }
        else if( v == btnDBExample1)
        {
            Intent i = new Intent(this, DbExample1.class);
            startActivity(i);
        }
        else if( v == btnDBExample2)
        {
            Intent i = new Intent(this, DbExample2.class);
            startActivity(i);
        }

    } // end onClick()

    public void handleOpenChatsScreen(View v)
    {
        Intent i = new Intent(this, ChatsActivity.class);
        startActivity(i);
    } // end handleOpenChatsScreen()

    public void handleOpenCheckbox(View v)
    {
        //Log.d("bca", "TODO: open Checkbox activity");
        Intent i = new Intent(this, CheckboxDemoActivity.class);
        startActivity(i);

    } // end handleOpenCheckbox()

    public void handleOpenCheckbox2(View v)
    {
        Intent i = new Intent(this, CheckboxDemoActivity2.class);
        startActivity(i);
    } // end handleOpenCheckbox2()

    public void handleOpenDemoRadio(View v)
    {
        Intent i = new Intent(this, RadiobuttonActivity.class);
        startActivity(i);
    } // end handleOpenDemoRadio()

    public void handleOpenSpinner(View v)
    {
        Intent i = new Intent(this, SpinnerActivity.class);
        startActivity(i);
    } // end handleOpenSpinner()
}