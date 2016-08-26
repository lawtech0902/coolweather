package com.example.lawtech.coolweather.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by lawtech on 16/8/26.
 */
public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
