package com.sunqi.test.cm.toucheventdispatchdemo;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class MyGroupView extends FrameLayout {

    public MyGroupView(Context context) {
        super(context);
        this.setEnabled(true);
    }

    public MyGroupView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setEnabled(true);
    }

    public MyGroupView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setEnabled(true);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyGroupView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.setEnabled(true);
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("TouchProcess", "MyGroupView dispatchTouchEvent --> " + ev.getAction());
        boolean result = super.dispatchTouchEvent(ev);
//        Log.e("TouchProcess", "MyGroupView dispatchTouchEvent return --> " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TouchProcess", "MyGroupView onTouchEvent --> " + event.getAction());
        boolean result = true;
//        Log.e("TouchProcess", "MyGroupView onTouchEvent return --> " + result);
        return result;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("TouchProcess", "MyGroupView onInterceptTouchEvent --> " + ev.getAction());
        if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            return true;
        }
        boolean result = super.onInterceptTouchEvent(ev);
//        Log.e("TouchProcess", "MyGroupView onInterceptTouchEvent return --> " + result);
        return result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
