package com.example.appfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class RadiobuttonActivity
        extends AppCompatActivity
        implements View.OnClickListener
{

    Button b;
    RadioButton rdbyes, rdbno, rdbmaybe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);

        b = findViewById(R.id.btnSubmit);
        rdbyes = findViewById(R.id.rdbYes);
        rdbno = findViewById(R.id.rdbNo);
        rdbmaybe = findViewById(R.id.rdbMaybe);


        b.setOnClickListener(this);


    } // end onCreate()

    public void onClick(View v)
    {
        if( rdbyes.isChecked() )
        {
            Toast.makeText(this, "You have succesfully been registered as a participant", Toast.LENGTH_SHORT).show();
        }
        else if ( rdbno.isChecked() )
        {
            Toast.makeText(this, "Not Registered.  Good Bye..", Toast.LENGTH_SHORT).show();
        }
        else if( rdbmaybe.isChecked() )
        {
            Toast.makeText(this, "You can confirm your participation till sunday", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "You did not choose any option", Toast.LENGTH_SHORT).show();
        }


    } // end onClick()
}