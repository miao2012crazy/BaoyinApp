package com.xialan.baoyin.view;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.PayeeContract;
import com.xialan.baoyin.presenter.PayeePresenter;

/**
 * Created by Administrator on 2018/1/12.
 */

public class PayeeActivity extends BaseActivity implements PayeeContract.View {

    private PayeePresenter payeePresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_payee;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected BasePresenter createPresenter() {
        payeePresenter = new PayeePresenter(this);
        return payeePresenter;
    }
}
