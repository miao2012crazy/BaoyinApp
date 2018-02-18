package com.xialan.baoyin.view.fragment;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseFragment;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.JiFenSelectContract;
import com.xialan.baoyin.presenter.JiFenSelectPresenter;

/**
 * Created by Administrator on 2018/1/14 0014.
 */

public class JiFenSelectFragment extends BaseFragment implements JiFenSelectContract.View {

    private JiFenSelectPresenter jiFenSelectPresenter;

    @Override
    protected int getContentId() {
        return R.layout.activity_jifen;
    }

    @Override
    protected void loadData() {

    }

    @Override
    protected BasePresenter createPresenter() {
        jiFenSelectPresenter = new JiFenSelectPresenter(this);
        return jiFenSelectPresenter;
    }
}
