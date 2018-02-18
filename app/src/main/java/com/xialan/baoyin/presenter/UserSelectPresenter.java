package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.UserSelectContract;

/**
 * Created by Administrator on 2018/1/14 0014.
 */

public class UserSelectPresenter extends BasePresenter implements UserSelectContract.Presenter {
    private final UserSelectContract.View mView;
    public UserSelectPresenter(UserSelectContract.View view) {

        this.mView=view;
    }
}
