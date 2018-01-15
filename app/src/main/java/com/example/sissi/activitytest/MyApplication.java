package com.example.sissi.activitytest;


import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by Sissi on 1/15/2018.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        PcTrace.p("-=->");
        super.onCreate();
    }

    @Override
    public void onTrimMemory(int level) {
        PcTrace.p("-=->");
        super.onTrimMemory(level);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        PcTrace.p("-=->");
        super.onConfigurationChanged(newConfig);
    }
}
