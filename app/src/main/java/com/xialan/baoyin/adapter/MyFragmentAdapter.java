package com.xialan.baoyin.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.xialan.baoyin.fragmentfactory.MainFragmentFactory;

/**
 * Created by Administrator on 2018/1/14 0014.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = MainFragmentFactory.getFragment(position);
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}