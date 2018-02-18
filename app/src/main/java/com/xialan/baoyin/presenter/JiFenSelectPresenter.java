package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.JiFenSelectContract;

/**
 * Created by Administrator on 2018/1/14 0014.
 */

public class JiFenSelectPresenter extends BasePresenter implements JiFenSelectContract.Presenter {
    private final JiFenSelectContract.View mView;

    public JiFenSelectPresenter(JiFenSelectContract.View view) {
        this.mView=view;
    }
}
