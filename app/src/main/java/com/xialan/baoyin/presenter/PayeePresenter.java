package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.PayeeContract;

/**
 * Created by Administrator on 2018/1/12.
 */

public class PayeePresenter extends BasePresenter implements PayeeContract.Presenter {
    private final PayeeContract.View mView;

    public PayeePresenter(PayeeContract.View view) {
        this.mView=view;
    }
}
