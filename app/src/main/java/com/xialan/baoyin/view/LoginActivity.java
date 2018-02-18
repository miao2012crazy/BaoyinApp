package com.xialan.baoyin.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.commonutil.SignUtil;
import com.xialan.baoyin.commonutil.StringUtil;
import com.xialan.baoyin.commonutil.UIUtils;
import com.xialan.baoyin.contract.LoginContract;
import com.xialan.baoyin.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/17.
 */

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.et_user_name)
    EditText etUserName;
    @BindView(R.id.et_user_psd)
    EditText etUserPsd;
    @BindView(R.id.btn_login)
    Button btnLogin;
    private LoginPresenter loginPresenter;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected BasePresenter createPresenter() {
        loginPresenter = new LoginPresenter(this);
        return loginPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        String user_name = etUserName.getText().toString();
        String user_psd = etUserPsd.getText().toString();
        if (StringUtil.isEmpty(user_name)){
            UIUtils.showToast("用户名不能为空");
            return;
        }
        if (StringUtil.isEmpty(user_psd)){
            UIUtils.showToast("密码不能为空");
            return;
        }
        String[] str={"userName="+"15840066019","password="+"123456a","inputCharset=UTF-8","signType="+"MD5","merchantId=1"};
        String treatSign = SignUtil.getTreatSign(str);
        Log.e("MIAOURLENCODEUTF8",treatSign);
        String string = treatSign + SignUtil.MD5PRIVATEKEY;
        Log.e("拼接私钥",string);
        String s = StringUtil.MD5(string);
        Log.e("MD532签名",s);
        loginPresenter.login("15840066019","123456a","UTF-8","MD5",s,"1");



    }
}
