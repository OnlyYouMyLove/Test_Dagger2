package com.smartisan.dagger2;


import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {

    @Provides
    @Gasloline
    public Engine provideGasoline(){
        return new GasolineEngline();
    }

    @Provides
    @Diesel
    public Engine provideDiesel(){
        return new DieselEngline();
    }
}
