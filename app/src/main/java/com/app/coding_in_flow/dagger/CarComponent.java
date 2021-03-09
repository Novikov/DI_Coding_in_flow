package com.app.coding_in_flow.dagger;

import com.app.coding_in_flow.MainActivity;

import dagger.Component;

//Injector
@Component(modules = {WheelsModule.class,DieselEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
