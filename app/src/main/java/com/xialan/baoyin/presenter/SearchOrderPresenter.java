package com.xialan.baoyin.presenter;

import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.SearchOrderContract;

/**
 * Created by Administrator on 2018/1/12.
 */

public class SearchOrderPresenter extends BasePresenter implements SearchOrderContract.Presenter {
    private final SearchOrderContract.View mView;

    public SearchOrderPresenter(SearchOrderContract.View view) {
        this.mView=view;
    }
}
