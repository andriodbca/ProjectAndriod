package com.example.appfirst;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chats);

    } // end onCreate()

    @Override
    public boolean onCreateOptionsMenu(Menu m)
    {
        getMenuInflater().inflate(R.menu.collegemenu, m);
        return true;
    } // end onCreateOptionsMenu()

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if( item.getItemId() == R.id.mnuHome)
        {
            this.finish();
        }
        else if ( item.getItemId() == R.id.mnuProfile)
        {
            Toast.makeText(this, "This feature will be available soon", Toast.LENGTH_SHORT).show();
        }
        else if ( item.getItemId() == R.id.mnuExit)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

        return true;
    } // end onOptionsItemSelected()

}