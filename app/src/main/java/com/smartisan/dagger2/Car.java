package com.smartisan.dagger2;

import javax.inject.Inject;

public class Car {
    private Engine mEngine;

    @Inject
    public Car(@Gasloline Engine engine) {
        mEngine = engine;
    }
    public String run(){
        return mEngine.work();
    }
}
