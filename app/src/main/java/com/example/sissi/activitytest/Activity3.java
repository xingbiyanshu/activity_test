package com.example.sissi.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Activity3 extends Activity {

    /**onCreate是子activity中唯一必须实现的方法 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PcTrace.p("-=->");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3); // 必须在onCreate中调用setContentView
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent();
//                intent.setAction("com.example.sissi.activitytest.ACTION1"); // 隐式匹配必须要设置action
//                startActivity(intent);
//            }
//        }, 2000);
    }
}
