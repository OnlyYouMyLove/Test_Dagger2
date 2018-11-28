package com.smartisan.dagger2;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

@Module
public class GsonModule {

    @ApplicationScope
    @Provides
    public Gson provideGson(){
        return new Gson();
    }
}
