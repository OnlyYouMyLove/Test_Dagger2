package com.smartisan.dagger2;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

@Module
public class GsonModule {

    @Provides
    public Gson provideGson(){
        return new Gson();
    }
}
