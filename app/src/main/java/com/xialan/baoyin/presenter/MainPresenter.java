package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.MainContract;

/**
 * Created by Administrator on 2018/1/12.
 */

public class MainPresenter extends BasePresenter implements MainContract.Presenter {
    private final MainContract.View mView;

    public MainPresenter(MainContract.View view) {
        this.mView=view;
    }
}
