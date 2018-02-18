package com.xialan.baoyin.commonutil;

import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/1/22.
 */

public class SignUtil {
//    public static String MD5PRIVATEKEY="d6f983e71635436992a30009def7d59d";
    public static String MD5PRIVATEKEY="66c14d69a65c45729628acf96e4452c9";
    public static String getTreatSign(String[] str) {
        String signStr="";
        Arrays.sort(str);
        for (int i=0;i<str.length;i++) {
            Log.e("miao",str[i]);
            signStr+=str[i];
            if (i!=str.length-1){
                signStr+="&";
            }
        }
        Log.e("miao",signStr);
//        try {
//            signStr = URLEncoder.encode(signStr, "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            signStr="";
//        }
        return signStr;
    }
}
