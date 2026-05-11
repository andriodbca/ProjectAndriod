package com.example.appfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CheckboxDemoActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_demo2);

    }



    public void onUpdateNameClicked(View v)
    {
        EditText edt = findViewById(R.id.txtName);
        String newname = edt.getText().toString();

        Toast.makeText(this, "Your name is updated to: " + newname , Toast.LENGTH_SHORT).show();
    } // end onUpdateNameClicked

    public void onEnableCheckboxClicked(View v)
    {
        EditText edt = findViewById(R.id.txtName);
        Button btn = findViewById(R.id.btnUpdateName);

        CheckBox c = (CheckBox) v;
        // Checkbox c = findViewById(R.id.chkEnable);

        if( c.isChecked() )
        {
            edt.setEnabled(true);
            btn.setEnabled(true);
        }
        else
        {
            edt.setEnabled(false);
            btn.setEnabled(false);
        }
    }  // end
}