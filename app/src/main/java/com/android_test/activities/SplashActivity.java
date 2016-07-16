package com.android_test.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android_test.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // TODO
        // show a progress bar in the middle of the screen
        // After 3 seconds start the MainActivity
    }
}
