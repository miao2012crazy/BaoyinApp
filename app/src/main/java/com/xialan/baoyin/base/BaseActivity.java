package com.xialan.baoyin.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.xialan.baoyin.commonutil.UIUtils;
import com.xialan.baoyin.ui.CustomProgressBar;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by ${苗春良}
 * on 2016/11/23.
 */
public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity implements BaseView{
    protected T mPresenter;
    private Unbinder bind;
//    private Toolbar toolbar;
    private CustomProgressBar customProgressBar;
    private Toolbar toolbar;
    private TextView tv_title;

    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setlayoutID());
        bind = ButterKnife.bind(this);
        // 经测试在代码里直接声明透明状态栏更有效
       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
        }
        mPresenter = createPresenter();
        //presenter层和view层绑定
        mPresenter.attachView((V) this);
        initData();
    }

    protected abstract int setlayoutID();
    /**
     * 加载数据操作
     */
    protected abstract void initData();

    /**
     * @return 创建presenter
     */
    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
        if (mPresenter != null)
            //解除绑定
            mPresenter.detachView();
    }
    public void onResume() {
        super.onResume();
        mPresenter.attachView((V) this);
    }
    public void onPause() {
        super.onPause();
    }

    @Override
    public void showCustomProgressBar(String msg) {
        if (customProgressBar ==null){
            customProgressBar = new CustomProgressBar(this);
        }
        if (!msg.equals("")){
            customProgressBar.setMessage(msg);
        }
        customProgressBar.show();
    }

    @Override
    public void hideCustomProgressBar() {
        if (customProgressBar !=null){
            customProgressBar.dismiss();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    public void startActivity_base(Class clazz){
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

}

