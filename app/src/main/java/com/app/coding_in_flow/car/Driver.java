package com.app.coding_in_flow.car;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Driver {
    String name;

    public Driver(String name) {
        this.name = name;
    }
}
