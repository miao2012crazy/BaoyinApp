package com.xialan.baoyin.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.PayeeContract;
import com.xialan.baoyin.presenter.PayeePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/1/12.
 */
public class PayeeActivity extends BaseActivity implements PayeeContract.View {

    @BindView(R.id.web_view)
    WebView webView;
    @BindView(R.id.rl_return)
    RelativeLayout rlReturn;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    private PayeePresenter payeePresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_payee;
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void initData() {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl("http://wechat.baoyinpay.com/wechat/login");
        tvTitle.setText("收帐功能");
        rlReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected BasePresenter createPresenter() {
        payeePresenter = new PayeePresenter(this);
        return payeePresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

}
