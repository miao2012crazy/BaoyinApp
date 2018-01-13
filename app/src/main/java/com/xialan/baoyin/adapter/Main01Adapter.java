package com.xialan.baoyin.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xialan.baoyin.R;
import com.xialan.baoyin.base.Main01Bean;

import java.util.List;

/**
 * Created by Administrator on 2018/1/12.
 */

public class Main01Adapter extends BaseQuickAdapter<Main01Bean,BaseViewHolder> {
    public Main01Adapter(List<Main01Bean> data) {
        super(R.layout.main_01_item, data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Main01Bean main01Bean) {
        baseViewHolder.setImageDrawable(R.id.iv_main_01,main01Bean.getDrawable())
                .setText(R.id.tv_item_main_01,main01Bean.getTitle());
    }
}
