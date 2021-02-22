package com.example.loginactivity;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("lEtkipxGG7J6q53Qx6bproniiNdBdYz4MMHKSpsv")
                .clientKey("49BqbfLYzdVJ00Km1yR2o8fyZDbLYj2S1AzYGSiK")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
