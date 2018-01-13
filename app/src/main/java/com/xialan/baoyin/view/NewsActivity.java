package com.xialan.baoyin.view;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.NewsContract;
import com.xialan.baoyin.presenter.NewsPresenter;

/**
 * Created by Administrator on 2018/1/12.
 */

public class NewsActivity extends BaseActivity implements NewsContract.View {

    private NewsPresenter newsPresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_news;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected BasePresenter createPresenter() {
        newsPresenter = new NewsPresenter(this);
        return newsPresenter;
    }
}
