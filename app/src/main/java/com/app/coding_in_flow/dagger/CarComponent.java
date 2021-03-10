package com.app.coding_in_flow.dagger;

import com.app.coding_in_flow.MainActivity;
import com.app.coding_in_flow.car.PetrolEngine;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

//Injector
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
