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
//                intent.addCategory("android.intent.category.TEST"); // 单独的category无法匹配intent-filter，需和action配合使用　
//                intent.setAction("android.intent.action.VIEW"); // 一个intent只能设置一个action，后设置的会覆盖前面设置的
                startActivity(intent);
            }
        }, 3000);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        PcTrace.p("-=->");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        PcTrace.p("-=->");
        super.onNewIntent(intent);
    }

    @Override
    protected void onRestart() {
        PcTrace.p("-=->");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        PcTrace.p("-=->");
        super.onStart();
    }

    @Override
    protected void onResume() {
        PcTrace.p("-=->");
        super.onResume();
    }

    @Override
    protected void onPause() {
        PcTrace.p("-=->");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        PcTrace.p("-=->");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        PcTrace.p("-=->");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        PcTrace.p("-=->");
        super.onDestroy();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        PcTrace.p("-=->");
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onPostResume() {
        PcTrace.p("-=->");
        super.onPostResume();
    }

    @Override
    protected void onUserLeaveHint() {
        PcTrace.p("-=->");
        super.onUserLeaveHint();
    }

    @Override
    public void onAttachedToWindow() {
        PcTrace.p("-=->");
        super.onAttachedToWindow();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        PcTrace.p("-=->");
        super.onWindowFocusChanged(hasFocus);
    }

}
