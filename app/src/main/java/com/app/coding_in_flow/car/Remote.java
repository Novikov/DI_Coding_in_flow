package com.app.coding_in_flow.car;

import android.util.Log;

import com.app.coding_in_flow.car.Car;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "Car";

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
