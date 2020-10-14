package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5APzQ3dg0C88TE4RickY22DcHW3ohJpaCFd1Ipv3")
                .clientKey("ljjrDzQMcGPTmartjvTETdRQ5DMBqiQmGGnoBS99")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
