package com.example.appfirst;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class DbExample2 extends AppCompatActivity implements View.OnClickListener {

    Button btnShow;
    TextView lblUsers;
    SQLiteDatabase mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbexample2);

        btnShow = findViewById(R.id.btnShowAllUsers);
        btnShow.setOnClickListener(this);
        lblUsers = findViewById(R.id.lblAllUsers);

        // Database Initialization
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
        // "SELECT * FROM Users";
        StringBuilder mystring = new StringBuilder();

        Cursor c = mydb.query("Users", null, null, null, null, null, null);

        if( c.moveToFirst() ) {
            mystring.append(c.getInt(0));
            mystring.append(" | ");
            mystring.append(c.getString(1));
            mystring.append(" | ");
            mystring.append(c.getString(2));
            mystring.append(" | ");
            mystring.append(c.getString(3));
        }

        while( c.moveToNext())
        {
            mystring.append("\n");
            mystring.append(c.getInt(0));
            mystring.append(" | ");
            mystring.append(c.getString(1));
            mystring.append(" | ");
            mystring.append(c.getString(2));
            mystring.append(" | ");
            mystring.append(c.getString(3));
        }

        lblUsers.setText(mystring);

        c.close();
    } // end fn
}