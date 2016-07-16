package com.android_test.controllers;

import com.android_test.interfaces.ListCallback;

/**
 * Created by vrunoa on 7/15/16.
 */
public class DataController {
    /*
    The DataController is going to be in charge of the API request, implement
    here the call to the rest service
    Use your own code for the Request, or check Retrofit documentation
    http://square.github.io/retrofit/
     */

    public void getPictures(ListCallback callback) {
        // Load a list of JSON objects from
        // https://pixabay.com/api/?key=2927999-e42a72e5e124982c71a3e840b&q=android&per_page=10
        // and pass them back to the MainActivity
    }
}
