package com.xialan.baoyin.base;

import android.graphics.drawable.Drawable;

/**
 * Created by Administrator on 2018/1/12.
 */

public class Main01Bean {
    private String title;
    private Drawable drawable;

    public Main01Bean(String title, Drawable drawable) {
        this.title = title;
        this.drawable = drawable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
