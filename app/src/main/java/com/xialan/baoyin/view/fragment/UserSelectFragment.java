package com.xialan.baoyin.view.fragment;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseFragment;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.UserSelectContract;
import com.xialan.baoyin.presenter.UserSelectPresenter;

/**
 * Created by Administrator on 2018/1/14 0014.
 */

public class UserSelectFragment extends BaseFragment implements UserSelectContract.View {
    @Override
    protected int getContentId() {

        return R.layout.activity_user_select;
    }

    @Override
    protected void loadData() {

    }

    @Override
    protected BasePresenter createPresenter() {
        UserSelectPresenter userSelectPresenter = new UserSelectPresenter(this);
        return userSelectPresenter;
    }
}
