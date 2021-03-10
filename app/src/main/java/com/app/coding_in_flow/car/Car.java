package com.app.coding_in_flow.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    Car(Engine engine, Wheels wheels, Driver driver){
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    public void drive(){
        engine.start();
        Log.d(TAG, driver +" drives "+ this);
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}
