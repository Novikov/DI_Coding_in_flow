package com.app.coding_in_flow.dagger;

import com.app.coding_in_flow.car.DieselEngine;
import com.app.coding_in_flow.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindDieselEngine(DieselEngine engine);
}
