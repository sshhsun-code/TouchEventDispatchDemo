package com.sunqi.test.cm.toucheventdispatchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollView view = new ScrollView(MainActivity.this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TouchProcess", "MainActivity onTouchEvent --> " + event.getAction());
        boolean result = false;
//        Log.e("TouchProcess", "MainActivity onTouchEvent return --> " + result);
        return result;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("TouchProcess", "MainActivity dispatchTouchEvent --> " + ev.getAction());
        boolean result = super.dispatchTouchEvent(ev);
//        Log.e("TouchProcess", "MainActivity dispatchTouchEvent return --> " + result);
        return result;
    }
}
