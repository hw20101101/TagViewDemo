package com.hw.a20170823viewgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import co.lujun.androidtagview.TagContainerLayout;

/**
 * Created by HW on 23/08/2017.
 * 定制 TagView
 */

public class HWTagContainerLayout extends TagContainerLayout {

    /*是否拦截点击事件*/
    private boolean ifInterceptEvent;

    public HWTagContainerLayout(Context context) {
        super(context);
    }

    public HWTagContainerLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HWTagContainerLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public boolean isIfInterceptEvent() {
        return ifInterceptEvent;
    }

    public void setIfInterceptEvent(boolean ifInterceptEvent) {
        this.ifInterceptEvent = ifInterceptEvent;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.e("ViewGroupTAG", "-->> HWTagContainerLayout dispatchTouchEvent");

        if (ifInterceptEvent){
            return true; //拦截点击事件，listView不会响应点击事件
        } else {
            return false;//不拦截点击事件，listView也会响应点击事件
        }
    }
}
