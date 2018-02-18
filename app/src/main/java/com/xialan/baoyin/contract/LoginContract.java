package com.xialan.baoyin.contract;

import retrofit2.http.Field;

/**
 * Created by Administrator on 2018/1/17.
 */

public interface LoginContract {
    interface Model {
    }

    interface View {
    }

    interface Presenter {
        void login( String userName,  String password,String inputCharset,  String signType, String signature,  String merchantId);

    }
}
