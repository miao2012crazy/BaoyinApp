package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.UserInfoContract;

/**
 * Created by Administrator on 2018/1/12.
 */

public class UserInfoPresenter extends BasePresenter implements UserInfoContract.Presenter {
    private final UserInfoContract.View mView;

    public UserInfoPresenter(UserInfoContract.View view) {
        this.mView=view;
    }
}
