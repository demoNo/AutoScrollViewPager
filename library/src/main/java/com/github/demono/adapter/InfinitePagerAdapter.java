package com.github.demono.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.jakewharton.salvage.RecyclingPagerAdapter;

/**
 * Created by yohan on 2016/11/30.
 * 无限滚动Adapter
 */

public abstract class InfinitePagerAdapter extends RecyclingPagerAdapter {

    private static final int INFINITE_COUNT = 400;

    @Override
    public View getView(int position, View convertView, ViewGroup container) {
        return getItemView(getPosition(position), convertView, container);
    }

    @Override
    public int getCount() {
        return getItemCount() == 1 ? 1 : (INFINITE_COUNT - INFINITE_COUNT % getItemCount()) + 2;
    }

    /**
     * 获取item count
     * @return
     */
    public abstract int getItemCount();

    /**
     * 获取真实的item position
     * @param position
     * @return
     */
    public int getPosition(int position) {
        if (getItemCount() == 1) {
            return 0;
        }
        if (position == 0) {
            // 如果position == 0返回最后一个item
            return getItemCount() - 1;
        } else if (position == (getCount() - 1)) {
            // 如果position到最后则返回第一个item
            return 0;
        }
        return (position - 1) % getItemCount();
    }

    /**
     * 获取item view
     * @param position
     * @param convertView
     * @param container
     * @return
     */
    public abstract View getItemView(int position, View convertView, ViewGroup container);
}
