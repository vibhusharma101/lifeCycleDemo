package com.vibhusharma.activitylifecycleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i("Reference","OnCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void change(View view)
    {
        startActivity(new Intent(getApplicationContext(),SampleActivity.class));
        finish();

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Reference","OnStart()");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Reference","OnResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Reference","OnPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Reference","OnStop()");




    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Reference","OnDestroy()");

    }





}
