package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.ForumContract;

/**
 * Created by Administrator on 2018/1/12.
 */

public class ForumPresenter extends BasePresenter implements ForumContract.Presenter {
    private final ForumContract.View mView;

    public ForumPresenter(ForumContract.View view) {
        this.mView=view;
    }
}
