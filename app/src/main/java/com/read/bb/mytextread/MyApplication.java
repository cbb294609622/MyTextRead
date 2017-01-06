package com.read.bb.mytextread;

import android.app.Application;

/**
 * Created by bb on 2017/1/6.
 */
public class MyApplication extends Application {
    private static MyApplication singleton;

    public static MyApplication getInstance() {
        return singleton;
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        singleton = this;
    }
}
