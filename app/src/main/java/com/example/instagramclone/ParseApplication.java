package com.example.instagramclone;

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
                .applicationId("Mx9mGRnGG92Gd1LOscMFWJmfd4AA2SkNro7k4sga")
                .clientKey("KQ6ZUnFEcLkLabD0AL6h4OvRMrQh11EW8eqaV5nW")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
