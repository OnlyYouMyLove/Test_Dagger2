package com.smartisan.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class SuperManModule {

    @Provides
    public SuperMan provideSuperMan(){
        return new SuperMan();
    }
}
