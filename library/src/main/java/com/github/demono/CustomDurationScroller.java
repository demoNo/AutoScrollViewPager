package com.github.demono;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * Created by yohan on 2016/11/30.
 * 自定义速度的scroller
 */

public class CustomDurationScroller extends Scroller {

    private int mDuration;

    public CustomDurationScroller(Context context) {
        super(context);
    }

    public CustomDurationScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        startScroll(startX, startY, dx, dy, mDuration);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, mDuration);
    }

    /**
     * 获取滚动间隔时间
     * @return
     */
    public int getMduration() {
        return mDuration;
    }

    /**
     * 设置滑动时间间隔
     * @param duration
     */
    public void setDuration(int duration) {
        mDuration = duration;
    }
}
