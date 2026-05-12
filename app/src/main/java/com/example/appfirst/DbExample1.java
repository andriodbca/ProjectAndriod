package com.example.appfirst;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.*;

import android.view.View;
import android.widget.*;


public class DbExample1 extends AppCompatActivity implements View.OnClickListener {

    EditText txtN, txtE, txtP;
    Button btnR;
    TextView lblMsg;

    SQLiteDatabase mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_example1);

        txtN = findViewById(R.id.txtName);
        txtE = findViewById(R.id.txtEmail);
        txtP = findViewById(R.id.txtPassword);
        btnR = findViewById(R.id.btnRegister);
        lblMsg = findViewById(R.id.lblMessageRegister);

        btnR.setOnClickListener(this);


        // Database Code
        mydb = openOrCreateDatabase("pulwamadata.db", Context.MODE_PRIVATE, null  );

        Cursor c = mydb.query("sqlite_master", null, "type=? and name=?", new String[] {"table", "Users"}, null, null, null);

        if( c.getCount() == 0)
        {
            mydb.execSQL("CREATE TABLE Users(UserID INTEGER PRIMARY KEY NOT NULL, Name TEXT, Email TEXT, Password TEXT);");

        }

    } // end fn


    @Override
    public void onClick(View v)
    {
        String name = txtN.getText().toString();
        String email = txtE.getText().toString();
        String pass = txtP.getText().toString();

        // "INSERT INTO Users(Name, Email, Password) VALUES(name, email, pass)";
        String query =  "INSERT INTO Users(Name, Email, Password) VALUES('" + name + "', '" + email + "', '" + pass + "')";
        // "INSERT INTO Users(Name, Email, Password) VALUES('john smith', 'johns123@gmail.com', 'pulwama123')";

        try
        {
            mydb.execSQL(query);
            Toast.makeText(this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
            txtN.setText("");
            txtE.setText("");
            txtP.setText("");
        }
        catch(SQLException e)
        {
            lblMsg.setText("Exception. Failed to create user\n" + e.toString());
        }



    } // end fn
}