package com.smartisan.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    //    @Inject
//    Person mPerson;
    @Inject
    Gson mGson;
    @Inject
    Gson mGson2;
//    @Inject
//    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
//        DaggerMainActivityComponent.create().inject(this);
//        mPerson.eat();

//        String jsonData = "{'name':'fukq','age':18}";
//        Man man = mGson.fromJson(jsonData,Man.class);
////        Log.i("fukq","name-------"+man.getName());
//
//        String str =mCar.run();
////        Log.d("fukq","car---" + str);

        App.get(SecondActivity.this).getActivityComponent().inject(this);

        Log.d("fukq:SecondActivity",mGson.hashCode()+"");
        Log.d("fukq:SecondActivity",mGson2.hashCode()+"");
    }
}

