package com.xialan.baoyin.bean;

/**
 * Created by Administrator on 2018/1/12.
 */

public class LoopListBean {

    /**
     * url : http://61.181.111.115:80/Storage/mall/appbanner/MAIN_BANNER01.jpg
     * product_id : 35
     */
    private String url;
    private String product_id;

    public String getUrl() {
        return url;
    }
    public String getProduct_id() {
        return product_id;
    }

    public LoopListBean(String url, String product_id) {
        this.url = url;
        this.product_id = product_id;
    }
}
