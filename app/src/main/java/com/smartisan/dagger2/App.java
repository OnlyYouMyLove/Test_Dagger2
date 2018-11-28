package com.smartisan.dagger2;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    ActivityComponent mActivityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mActivityComponent = DaggerActivityComponent.builder().build();
    }

    public static App get(Context context){
        return (App) context.getApplicationContext();
    }

    ActivityComponent getActivityComponent(){
        return mActivityComponent;
    }
}
