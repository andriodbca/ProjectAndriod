package com.example.appfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SpinnerActivity extends AppCompatActivity
    implements AdapterView.OnItemSelectedListener, View.OnClickListener
{

    Spinner sp;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        sp = findViewById(R.id.spnDistricts);
        sp.setOnItemSelectedListener(this);

        btnsave = findViewById(R.id.btnSaveDistrict);
        btnsave.setOnClickListener(this);
    }  // end onCreate()


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        /*
        String msg = "You have selected option number " + position;
        Toast.makeText(this, msg , Toast.LENGTH_SHORT).show();

        String name = sp.getSelectedItem().toString();

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        */
    } // end fn

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }  // end fn

    @Override
    public void onClick(View v)
    {
        String name = sp.getSelectedItem().toString();

        Toast.makeText(
                this,
                "You have selected district " + name,
                Toast.LENGTH_SHORT)
                .show();

    } // end onClick()
}