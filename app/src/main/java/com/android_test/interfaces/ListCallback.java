package com.android_test.interfaces;

import com.android_test.model.Picture;

import java.util.ArrayList;

/**
 * Created by vrunoa on 7/15/16.
 */
public interface ListCallback {
    void done(Exception e, ArrayList<Picture> list);
}
