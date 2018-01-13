package com.xialan.baoyin.view;

        import com.xialan.baoyin.R;
        import com.xialan.baoyin.base.BaseActivity;
        import com.xialan.baoyin.base.BasePresenter;
        import com.xialan.baoyin.contract.SearchOrderContract;
        import com.xialan.baoyin.presenter.SearchOrderPresenter;

/**
 * Created by Administrator on 2018/1/12.
 */

public class SearchOrderActivity extends BaseActivity implements SearchOrderContract.View {

    private SearchOrderPresenter searchOrderPresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_searchorder;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected BasePresenter createPresenter() {
        searchOrderPresenter = new SearchOrderPresenter(this);
        return searchOrderPresenter;
    }
}
