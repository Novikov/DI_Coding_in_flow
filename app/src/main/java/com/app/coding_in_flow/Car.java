package com.app.coding_in_flow;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    @Inject Engine engine;
    private Wheels wheels;

    @Inject
    Car(Wheels wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "driving...");
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}
