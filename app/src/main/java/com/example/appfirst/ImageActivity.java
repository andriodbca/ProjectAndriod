package com.example.appfirst;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;


import androidx.appcompat.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity
    implements View.OnClickListener
{

    Button btnN, btnP;
    ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imv = findViewById(R.id.imgFruits);
        btnN = findViewById(R.id.btnNext);
        btnP = findViewById(R.id.btnPrev);

        btnN.setOnClickListener(this);
    } // end onCreate()

    @Override
    public void onClick(View v)
    {
       //Log.d("pulwamacollege", "The onclick method is being called succesfully");

        imv.setImageResource(R.drawable.mango2);
    } // end onClick()

}