package com.smartisan.dagger2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {
    //    @Inject
//    Person mPerson;
    @Inject
    Gson mGson;
    @Inject
    Gson mGson2;
    //    @Inject
//    Car mCar;
//    @Inject
//    SuperMan mSuperMan;

    @Inject
    Lazy<SuperMan> mSuperManLazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerMainActivityComponent.create().inject(this);
//        mPerson.eat();

//        String jsonData = "{'name':'fukq','age':18}";
//        Man man = mGson.fromJson(jsonData,Man.class);
////        Log.i("fukq","name-------"+man.getName());
//
//        String str =mCar.run();
////        Log.d("fukq","car---" + str);

        App.get(MainActivity.this).getActivityComponent().inject(this);

//        Log.d("fukq:MainActivity", mGson.hashCode() + "");
//        Log.d("fukq:MainActivity", mGson2.hashCode() + "");
//
//        findViewById(R.id.bt_skip_to_second).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, SecondActivity.class));
//            }
//        });
        SuperMan superMan = mSuperManLazy.get();
        String str = superMan.fighting();
        Log.d("fukq", "onCreate: str" + str);
    }
}

