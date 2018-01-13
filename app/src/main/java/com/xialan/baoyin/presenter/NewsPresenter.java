package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.NewsContract;

/**
 * Created by Administrator on 2018/1/12.
 */

public class NewsPresenter extends BasePresenter implements NewsContract.Presenter {
    private final NewsContract.View mView;

    public NewsPresenter(NewsContract.View view) {
        this.mView=view;
    }
}
