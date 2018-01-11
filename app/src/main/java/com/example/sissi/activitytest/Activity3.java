package com.example.sissi.activitytest;

import android.app.Activity;
import android.os.Bundle;

public class Activity3 extends Activity {

    /**onCreate是子activity中唯一必须实现的方法 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3); // 必须在onCreate中调用setContentView
    }
}
