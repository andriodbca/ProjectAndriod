package com.example.appfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    } // end func

    public void operationAdd(View v)
    {
        EditText t1 = findViewById(R.id.txtNum1);
        EditText t2 = findViewById(R.id.txtNum2);
        TextView mylabel = findViewById(R.id.lblResult);

        String text1 = t1.getText().toString();
        String text2 = t2.getText().toString();

        int n1 = Integer.parseInt(text1);
        int n2 = Integer.parseInt(text2);

        int sum = n1 + n2;
        String sumstring = String.valueOf(sum);

        mylabel.setText( sumstring );

    } // end func

    public void operationSub(View v)
    {
        EditText a = findViewById(R.id.txtNum1);
        EditText b = findViewById(R.id.txtNum2);
        TextView c = findViewById(R.id.lblResult);

        String s1 = a.getText().toString();
        String s2 = b.getText().toString();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        int result = n1 - n2;

        String resultstring = String.valueOf(result);
        c.setText(resultstring);

    } // end func

    public void operationMultiply(View v)
    {
        EditText t1 = findViewById(R.id.txtNum1);
        EditText t2 = findViewById(R.id.txtNum2);
        TextView mylabel = findViewById(R.id.lblResult);

        String text1 = t1.getText().toString();
        String text2 = t2.getText().toString();

        int n1 = Integer.parseInt(text1);
        int n2 = Integer.parseInt(text2);

        int prod = n1 * n2;
        String prodstring = String.valueOf(prod);

        mylabel.setText(prodstring);
    } // end func

    public void operationDivide(View v)
    {
        EditText t1 = findViewById(R.id.txtNum1);
        EditText t2 = findViewById(R.id.txtNum2);
        TextView mylabel = findViewById(R.id.lblResult);

        String text1 = t1.getText().toString();
        String text2 = t2.getText().toString();

        int n1 = Integer.parseInt(text1);
        int n2 = Integer.parseInt(text2);

        int quot = n1 / n2;
        String quotstring = String.valueOf(quot);

        mylabel.setText(quotstring);
    } //

}