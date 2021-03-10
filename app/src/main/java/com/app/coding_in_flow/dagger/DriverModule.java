package com.app.coding_in_flow.dagger;

import com.app.coding_in_flow.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }
}
