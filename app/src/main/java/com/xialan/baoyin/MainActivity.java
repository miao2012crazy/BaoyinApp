package com.xialan.baoyin;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.igexin.sdk.PushManager;
import com.xialan.baoyin.adapter.MyFragmentAdapter;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.commonutil.UIUtils;
import com.xialan.baoyin.contract.MainContract;
import com.xialan.baoyin.presenter.MainPresenter;
import com.xialan.baoyin.service.CustomIntentService;
import com.xialan.baoyin.service.CustomPushService;
import com.xialan.baoyin.ui.NoPreloadViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainContract.View {


    @BindView(R.id.view_pager)
    NoPreloadViewPager viewPager;
    @BindView(R.id.ll_return)
    LinearLayout llReturn;
    @BindView(R.id.ll_home)
    LinearLayout llHome;
    @BindView(R.id.ll_user_select)
    LinearLayout llUserSelect;
    @BindView(R.id.ll_jfselect)
    LinearLayout llJfselect;
    private MainPresenter mainPresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        initViewPager();
//        startActivity_base(LoginActivity.class);
    }

    private void initViewPager() {
        viewPager = (NoPreloadViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyFragmentAdapter(getSupportFragmentManager()));
        viewPager.setNoScroll(true);
    }

    @Override
    protected BasePresenter createPresenter() {
        mainPresenter = new MainPresenter(this);
        return mainPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_return, R.id.ll_home, R.id.ll_user_select, R.id.ll_jfselect})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_return:
                UIUtils.showToast("点击了关闭");
                break;
            case R.id.ll_home:
                viewPager.setCurrentItem(0);
                break;
            case R.id.ll_user_select:
                viewPager.setCurrentItem(1);
                break;
            case R.id.ll_jfselect:
                viewPager.setCurrentItem(2);
                break;
        }
    }

    private long firstTime=0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK && event.getAction()==KeyEvent.ACTION_DOWN){
            if (System.currentTimeMillis()-firstTime>2000){
                Toast.makeText(MainActivity.this,"再按一次退出程序--->onKeyDown",Toast.LENGTH_SHORT).show();
                firstTime=System.currentTimeMillis();
            }else{
                finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onResume() {
        super.onResume();
        PushManager.getInstance().initialize(this.getApplicationContext(), CustomPushService.class);
        // com.getui.demo.CustomIntentService 为第三方自定义的推送服务事件接收类s
        PushManager.getInstance().registerPushIntentService(this.getApplicationContext(), CustomIntentService.class);
    }
}
