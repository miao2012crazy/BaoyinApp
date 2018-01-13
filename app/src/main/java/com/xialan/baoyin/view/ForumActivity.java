package com.xialan.baoyin.view;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.ForumContract;
import com.xialan.baoyin.presenter.ForumPresenter;

/**
 * Created by Administrator on 2018/1/12.
 */

public class ForumActivity extends BaseActivity implements ForumContract.View {

    private ForumPresenter forumPresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_forum;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected BasePresenter createPresenter() {
        forumPresenter = new ForumPresenter(this);
        return forumPresenter;
    }
}
