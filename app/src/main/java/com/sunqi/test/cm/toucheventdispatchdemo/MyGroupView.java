package com.sunqi.test.cm.toucheventdispatchdemo;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyGroupView extends LinearLayout{

    public MyGroupView(Context context) {
        super(context);
    }

    public MyGroupView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyGroupView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyGroupView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("sunqi", "MyGroupView dispatchTouchEvent --> " + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        if (event.getAction() == MotionEvent.ACTION_MOVE) {
//            Log.e("sunqi", "MyGroupView --> MotionEvent.ACTION_MOVE");
//            int x = (int) event.getX();
//            int y = (int) event.getY();
//            /**
//             * mScrollX是View左边缘的X坐标减去View内容左边缘的X坐标，因此如果手指是从左向右滑，
//             则mScrollX为负值，反之正值，mScrollY也是一样的,见源码
//             */
//            scrollTo(-x, -y);
//            return true;
//        } else {
//            Log.e("sunqi", "MyGroupView --> " + event.getAction());
//        }
        Log.e("sunqi", "MyGroupView onTouchEvent --> " + event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        if (ev.getAction() == MotionEvent.ACTION_MOVE) {
//            onTouchEvent(ev);
//            return true;
//        }
        Log.e("sunqi", "MyGroupView onInterceptTouchEvent --> " + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
