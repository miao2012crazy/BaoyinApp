package com.xialan.baoyin.fragmentfactory;


import android.support.v4.app.Fragment;

import com.xialan.baoyin.base.BaseFragment;
import com.xialan.baoyin.view.fragment.HomeFragment;
import com.xialan.baoyin.view.fragment.JiFenSelectFragment;
import com.xialan.baoyin.view.fragment.UserSelectFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/14 0014.
 */

public class MainFragmentFactory {

    private static Map<Integer, BaseFragment> mFragments = new HashMap<>();
    public static Fragment getFragment(int position) {
        BaseFragment fragment = null;
        fragment = mFragments.get(position);  //在集合中取出来Fragment
        if (fragment == null) {
            switch (position) {
                case 0:
                    fragment = new HomeFragment();
                    break;
                case 1:
                    fragment = new UserSelectFragment();
                    break;
                case 2:
                    fragment = new JiFenSelectFragment();
                    break;
            }
        }
        return fragment;
    }
}
