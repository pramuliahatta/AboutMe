package com.example.g_eight.aboutme.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.g_eight.aboutme.R;

/**
 * Created by G-Eight on 5/18/2019.
 * 10116114
 * Hatta Pramulia
 * IF-3
 **/

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, ViewPagerActivity.class);
                startActivity(i);
                finish();
            }
        }, 2000);
    }
}