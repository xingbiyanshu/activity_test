package com.example.sissi.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Activity2 extends Activity {

    /**onCreate是子activity中唯一必须实现的方法 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PcTrace.p("-=->");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2); // 必须在onCreate中调用setContentView
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setAction("com.example.sissi.activitytest.ACTION3"); // 隐式匹配必须要设置action
                startActivity(intent);
            }
        }, 2000);
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
    protected void onStop() {
        PcTrace.p("-=->");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        PcTrace.p("-=->");
        super.onDestroy();
    }
}
