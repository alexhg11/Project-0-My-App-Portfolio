package com.alexhdz.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Listener for first button
        Button button = (Button) findViewById(R.id.spotifyStreamerBtn);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Listener for second button
        button = (Button) findViewById(R.id.scoresAppBtn);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Scores App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Listener for third button
        button = (Button) findViewById(R.id.libraryAppBtn);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Library App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Listener for fourth button
        button = (Button) findViewById(R.id.buildItBiggerBtn);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Listener for fifth button
        button = (Button) findViewById(R.id.xyzReaderBtn);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // Listener for sixth button
        button = (Button) findViewById(R.id.capstoneBtn);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Capstone App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
