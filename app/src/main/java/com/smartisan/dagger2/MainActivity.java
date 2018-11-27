package com.smartisan.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Person mPerson;
    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.create().inject(this);
        mPerson.eat();

        String jsonData = "{'name':'fukq','age':18}";
        Man man = mGson.fromJson(jsonData,Man.class);
        Log.i("fukq","name-------"+man.getName());
    }
}

