package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();

        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cYbKe8BzMgFgQMslu8LbWmGK1bDscLfQgc4zs5RW")
                .clientKey("QFdXUvmbRRmRQ7lVTCfrrx0IWiVzFcSOZAvXF1i2")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
