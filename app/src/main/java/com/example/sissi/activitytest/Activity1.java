package com.example.sissi.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Activity1 extends Activity {

    /**onCreate是子activity中唯一必须实现的方法 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PcTrace.p("-=->");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1); // 必须在onCreate中调用setContentView
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setAction("com.example.sissi.activitytest.ACTION2"); // 隐式匹配必须要设置action
//                intent.addCategory("android.intent.category.TEST");　　// 单独的category无法匹配intent-filter，需和action配合使用　
                intent.setAction("android.intent.action.VIEW"); // 一个intent只能设置一个action，后设置的会覆盖前面设置的
                startActivity(intent);
            }
        }, 3000);
    }
}
