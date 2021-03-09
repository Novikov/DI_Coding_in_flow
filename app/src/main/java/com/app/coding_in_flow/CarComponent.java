package com.app.coding_in_flow;

import dagger.Component;

//Injector
@Component(modules = WheelsModule.class)
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
