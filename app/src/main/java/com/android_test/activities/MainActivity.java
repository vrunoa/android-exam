package com.android_test.activities;

import android.app.Activity;
import android.os.Bundle;

import com.android_test.R;

/**
 * Created by vrunoa on 7/15/16.
 */
public class MainActivity extends Activity {

    // It would be great if you use ButterKnife
    // http://jakewharton.github.io/butterknife/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         Use the DataController to load a list of images provided by a request to
         and show them in a RecyclerView. You're going to be loading image from an URL.
         Have you ever use a library for caching images locally ? No ?
         Checkout Picasso. http://square.github.io/picasso/
        */
    }
}
