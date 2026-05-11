package com.example.appfirst;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.*;

import android.widget.*;


public class DbExample1 extends AppCompatActivity {

    EditText txtN, txtE, txtP;
    Button b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_example1);

        txtN = findViewById(R.id.txtName);
        txtE = findViewById(R.id.txtEmail);
        txtP = findViewById(R.id.txtPassword);

    } // end fn


}