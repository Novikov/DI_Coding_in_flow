package com.app.coding_in_flow.dagger;

import com.app.coding_in_flow.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory {
        AppComponent create(DriverModule driverModule);
    }
}
