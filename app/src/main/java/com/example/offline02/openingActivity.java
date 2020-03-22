package com.example.offline02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class openingActivity extends AppCompatActivity {
     private static int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
        @Override
         public void run() {
         Intent homeintent=new Intent(openingActivity.this, secondActivity.class);
         startActivity(homeintent);
         finish();


        }
    }, SPLASH_TIME_OUT);
}
    }
