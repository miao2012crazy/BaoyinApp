package com.xialan.baoyin.httputil;

import java.io.File;
import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/9/1.
 * 请求网络的API接口类
 */
public interface ApiService {

    @FormUrlEncoded
    @POST("/order/login")
    Observable<ResponseBody> login(@Field("userName") String userName,@Field("password") String password,@Field("inputCharset") String inputCharset,@Field("signType") String signType,@Field("signature") String signature,@Field("merchantId") String merchantId);
}
