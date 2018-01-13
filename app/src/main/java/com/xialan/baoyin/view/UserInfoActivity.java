package com.xialan.baoyin.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.UserInfoContract;
import com.xialan.baoyin.presenter.UserInfoPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/12.
 */

public class UserInfoActivity extends BaseActivity implements UserInfoContract.View {

    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.rl_user_info)
    RelativeLayout rlUserInfo;
    @BindView(R.id.imageView1)
    ImageView imageView1;
    @BindView(R.id.rl_user_name)
    RelativeLayout rlUserName;
    @BindView(R.id.imageView2)
    ImageView imageView2;
    @BindView(R.id.rl_user_psd)
    RelativeLayout rlUserPsd;
    @BindView(R.id.imageView3)
    ImageView imageView3;
    @BindView(R.id.rl_user_address)
    RelativeLayout rlUserAddress;
    @BindView(R.id.imageView4)
    ImageView imageView4;
    @BindView(R.id.rl_user_sex)
    RelativeLayout rlUserSex;
    @BindView(R.id.imageView5)
    ImageView imageView5;
    @BindView(R.id.rl_user_jifen)
    RelativeLayout rlUserJifen;
    private UserInfoPresenter userInfoPresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_user_info;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected BasePresenter createPresenter() {
        userInfoPresenter = new UserInfoPresenter(this);
        return userInfoPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.rl_user_info, R.id.rl_user_name, R.id.rl_user_psd, R.id.rl_user_address, R.id.rl_user_sex, R.id.rl_user_jifen})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_user_info:
                break;
            case R.id.rl_user_name:
                break;
            case R.id.rl_user_psd:
                break;
            case R.id.rl_user_address:
                break;
            case R.id.rl_user_sex:
                break;
            case R.id.rl_user_jifen:
                break;
        }
    }
}
