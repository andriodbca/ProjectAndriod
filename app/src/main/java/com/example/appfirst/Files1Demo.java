package com.example.appfirst;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.DataInputStream;
import java.io.InputStream;

public class Files1Demo extends AppCompatActivity {

    EditText et;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_files1_demo);


        et = findViewById(R.id.txtFileViewer);
    }

    public void onBtnLoadFileClick(View v)
    {
        Resources r = this.getResources();
        InputStream is ;
        DataInputStream dis;
    }

}