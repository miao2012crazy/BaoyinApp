package com.xialan.baoyin.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * recycler view  框架 多布局
 * Created by Administrator on 2018/1/11.
 */
public class MultipleItem implements MultiItemEntity {
    public static final int MAIN_01 = 1;
    public static final int MAIN_02 = 2;
    public static final int MAIN_03 = 3;
    public static final int MAIN_04 = 4;
    private int mItemType;
    private DataBean_1 dataBean1;
    private DataBean_2 dataBean2;
    private DataBean_3 dataBean3;
    private DataBean_4 dataBean4;

    @Override
    public int getItemType() {
        return mItemType;
    }

    public DataBean_1 getDataBean1() {
        return dataBean1;
    }

    public DataBean_2 getDataBean2() {
        return dataBean2;
    }

    public DataBean_3 getDataBean3() {
        return dataBean3;
    }

    public DataBean_4 getDataBean4() {
        return dataBean4;
    }

    public static class DataBean_1 {
        private String type_title;
        private String type_time;

        public DataBean_1(String type_title, String type_time) {
            this.type_title = type_title;
            this.type_time = type_time;
        }

        public String getType_title() {
            return type_title;
        }

        public String getType_time() {
            return type_time;
        }
    }

    public static class DataBean_2 {
        private String product_img;
        private String product_id;

        public DataBean_2(String product_img, String product_id) {
            this.product_img = product_img;
            this.product_id = product_id;
        }

        public String getProduct_img() {
            return product_img;
        }

        public String getProduct_id() {
            return product_id;
        }
    }

    public static class DataBean_3 {
        private String product_img;
        private String product_id;

        public DataBean_3(String product_img, String product_id) {
            this.product_img = product_img;
            this.product_id = product_id;
        }

        public String getProduct_img() {
            return product_img;
        }

        public String getProduct_id() {
            return product_id;
        }
    }

    public static class DataBean_4 {
        private List<LoopListBean> loop_list;

        public DataBean_4(List<LoopListBean> loop_list) {
            this.loop_list = loop_list;
        }

        public List<LoopListBean> getLoop_list() {
            return loop_list;
        }

        public static class LoopListBean {
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
        }
    }


    //-=====================下面是构造方法=================
    /**
     * 轮播图
     *
     * @param mItemType
     * @param dataBean4
     */
    public MultipleItem(int mItemType, DataBean_4 dataBean4) {
        this.mItemType = mItemType;
        this.dataBean4 = dataBean4;
    }

    public MultipleItem(int mItemType, DataBean_3 dataBean3) {
        this.mItemType = mItemType;
        this.dataBean3 = dataBean3;
    }

    /**
     * 中间大图 商品
     *
     * @param mItemType
     * @param dataBean2
     */
    public MultipleItem(int mItemType, DataBean_2 dataBean2) {
        this.mItemType = mItemType;
        this.dataBean2 = dataBean2;
    }

    /**
     * 标题
     *
     * @param mItemType
     * @param dataBean1
     */
    public MultipleItem(int mItemType, DataBean_1 dataBean1) {
        this.mItemType = mItemType;
        this.dataBean1 = dataBean1;
    }

    public MultipleItem(int itemType) {
        this.mItemType = itemType;
    }


}
