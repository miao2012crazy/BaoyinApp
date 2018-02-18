package com.xialan.baoyin.view;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.ForumContract;
import com.xialan.baoyin.presenter.ForumPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/1/12.
 */

public class ForumActivity extends BaseActivity implements ForumContract.View {

    @BindView(R.id.rl_return)
    RelativeLayout rlReturn;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    private ForumPresenter forumPresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_forum;
    }

    @Override
    protected void initData() {
        tvTitle.setText("论坛");
        rlReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected BasePresenter createPresenter() {
        forumPresenter = new ForumPresenter(this);
        return forumPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
