package com.example.ankitm.intercomhelpcenter;

import android.app.Application;

import io.intercom.android.sdk.Intercom;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        String apiKey = ""; // add api key here
        String apiId = ""; // add app id here

        Intercom.initialize(MyApplication.this, apiKey, apiId);
    }
}
