package com.sunqi.test.cm.toucheventdispatchdemo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sunqi on 2018/4/26.
 */

@SuppressLint("AppCompatCustomView")
public class MyView extends TextView {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TouchProcess", "MyView onTouchEvent --> " + event.getAction());
        boolean result = true;
//        Log.e("TouchProcess", "MyView onTouchEvent return --> " + result);
        return result;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("TouchProcess", "MyView dispatchTouchEvent --> " + event.getAction());
        boolean result = super.dispatchTouchEvent(event);
//        Log.e("TouchProcess", "MyView dispatchTouchEvent return --> " + result);
        return result;
    }
}
