package com.xialan.baoyin.view;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.NewsContract;
import com.xialan.baoyin.presenter.NewsPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/1/12.
 */

public class NewsActivity extends BaseActivity implements NewsContract.View {

    @BindView(R.id.rl_return)
    RelativeLayout rlReturn;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    private NewsPresenter newsPresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_news;
    }

    @Override
    protected void initData() {
        tvTitle.setText("新闻中心");
        rlReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected BasePresenter createPresenter() {
        newsPresenter = new NewsPresenter(this);
        return newsPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
