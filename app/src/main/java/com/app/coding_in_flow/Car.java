package com.app.coding_in_flow;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    @Inject Engine engine;
    @Inject Wheels wheels;

    @Inject
    Car(){
    }

    public void drive(){
        Log.d(TAG, "driving...");
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}
