package com.android_test;
import android.app.Application;

import com.android_test.controllers.DataController;

public class App extends Application {

    private static DataController _dataController;

    public static DataController getController() {
        // Create a singleton pattern for the data controller
        return _dataController;
    }
}