package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.HomeContract;

/**
 * Created by Administrator on 2018/1/14 0014.
 */

public class HomePresenter extends BasePresenter implements HomeContract.Presenter {
    private final HomeContract.View mView;

    public HomePresenter(HomeContract.View view) {
        this.mView=view;
    }
}
