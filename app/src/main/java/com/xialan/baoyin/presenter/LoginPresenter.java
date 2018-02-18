package com.xialan.baoyin.presenter;

import android.util.Log;

import com.tamic.novate.BaseSubscriber;
import com.tamic.novate.Throwable;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.contract.LoginContract;
import com.xialan.baoyin.httputil.NovateUtil;

import java.io.IOException;

import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2018/1/17.
 */

public class LoginPresenter extends BasePresenter implements LoginContract.Presenter {
    private final LoginContract.View mView;

    public LoginPresenter(LoginContract.View view) {
        this.mView=view;
    }

    @Override
    public void login(String userName, String password, String inputCharset, String signType, String signature, String merchantId) {
        NovateUtil.getInstance().call(NovateUtil.getApiService().login(userName, password, inputCharset, signType, signature, merchantId), new BaseSubscriber<ResponseBody>() {
            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(ResponseBody responseBody) {
                try {
                    Log.e("结果:",responseBody.string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
