package com.example.sissi.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setAction("com.example.sissi.activitytest.ACTION1"); // 隐式匹配必须要设置action
//                intent.addCategory("android.intent.category.TEST"); // 单独的category无法匹配intent-filter，需和action配合使用　
//                intent.setAction("android.intent.action.VIEW"); // 一个intent只能设置一个action，后设置的会覆盖前面设置的
                startActivity(intent);
            }
        }, 2000);
    }
}
