package com.smartisan.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Person{
    @Inject
    public Person() {
    }

    public void eat(){
        Log.i("fukq","我要吃面包");
    }
}
