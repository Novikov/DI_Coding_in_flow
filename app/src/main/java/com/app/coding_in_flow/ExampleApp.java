package com.app.coding_in_flow;

import android.app.Application;

import com.app.coding_in_flow.dagger.ActivityComponent;
import com.app.coding_in_flow.dagger.AppComponent;
import com.app.coding_in_flow.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent(){
        return component;
    }
}
