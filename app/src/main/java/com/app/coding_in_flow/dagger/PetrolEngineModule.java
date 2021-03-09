package com.app.coding_in_flow.dagger;

import com.app.coding_in_flow.car.Engine;
import com.app.coding_in_flow.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine engine);
}
