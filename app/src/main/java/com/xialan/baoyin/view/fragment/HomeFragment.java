package com.xialan.baoyin.view.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jude.rollviewpager.OnItemClickListener;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.hintview.TextHintView;
import com.xialan.baoyin.R;
import com.xialan.baoyin.adapter.Main01Adapter;
import com.xialan.baoyin.adapter.RollAdapter;
import com.xialan.baoyin.base.BaseFragment;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.base.Main01Bean;
import com.xialan.baoyin.bean.LoopListBean;
import com.xialan.baoyin.commonutil.UIUtils;
import com.xialan.baoyin.contract.HomeContract;
import com.xialan.baoyin.presenter.HomePresenter;
import com.xialan.baoyin.view.ForumActivity;
import com.xialan.baoyin.view.NewsActivity;
import com.xialan.baoyin.view.PayeeActivity;
import com.xialan.baoyin.view.SearchOrderActivity;
import com.xialan.baoyin.view.UserInfoActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2018/1/14 0014.
 */

public class HomeFragment extends BaseFragment implements HomeContract.View {
    @BindView(R.id.rl_left)
    RelativeLayout rlLeft;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.rl_right)
    RelativeLayout rlRight;
    @BindView(R.id.roll_view_pager)
    RollPagerView rollViewPager;
    @BindView(R.id.rl_main_01)
    RecyclerView rlMain01;
    @BindView(R.id.rl_main_02)
    RecyclerView rlMain02;
    private List<LoopListBean> loopListBeans;
    private List<Main01Bean> main01Beans;
    private List<Main01Bean> main01Beans2;
    private HomePresenter homePresenter;

    @Override
    protected int getContentId() {
        return R.layout.activity_home;
    }

    @Override
    protected void loadData() {
        loopListBeans = new ArrayList<>();
        LoopListBean loopListBean = new LoopListBean("123123", "1");
        loopListBeans.add(loopListBean);
        loopListBeans.add(loopListBean);
        loopListBeans.add(loopListBean);
        initloop(loopListBeans);
        initMain01();
        initMain02();
        tvTitle.setText("首页");
    }

    private void initMain01() {
        main01Beans = new ArrayList<>();
        Main01Bean main01Bean0 = new Main01Bean("个人中心", UIUtils.getDrawable(R.mipmap.per));
        Main01Bean main01Bean1 = new Main01Bean("论坛", UIUtils.getDrawable(R.mipmap.lt));
        Main01Bean main01Bean2 = new Main01Bean("查账系统", UIUtils.getDrawable(R.mipmap.cz));
        Main01Bean main01Bean3 = new Main01Bean("收款系统", UIUtils.getDrawable(R.mipmap.sk));
        Main01Bean main01Bean4 = new Main01Bean("新闻中心", UIUtils.getDrawable(R.mipmap.xw));
        main01Beans.add(main01Bean0);
        main01Beans.add(main01Bean1);
        main01Beans.add(main01Bean2);
        main01Beans.add(main01Bean3);
        main01Beans.add(main01Bean4);
        rlMain01.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        Main01Adapter main01Adapter = new Main01Adapter(main01Beans);
        rlMain01.setAdapter(main01Adapter);
        rlMain01.addOnItemTouchListener(new com.chad.library.adapter.base.listener.OnItemClickListener() {
            @Override
            public void SimpleOnItemClick(BaseQuickAdapter baseQuickAdapter, View view, int position) {
                switch (position) {
                    case 0:
                        startActivity_base(UserInfoActivity.class);
                        break;
                    case 1:
                        startActivity_base(ForumActivity.class);
                        break;
                    case 2:
                        startActivity_base(SearchOrderActivity.class);
                        break;
                    case 3:
                        startActivity_base(PayeeActivity.class);
                        break;
                    case 4:
                        startActivity_base(NewsActivity.class);
                        break;

                }
            }
        });
    }

    private void initMain02() {
        main01Beans2 = new ArrayList<>();
        Main01Bean main01Bean0 = new Main01Bean("yrd", UIUtils.getDrawable(R.mipmap.yrd));
        Main01Bean main01Bean1 = new Main01Bean("bt", UIUtils.getDrawable(R.mipmap.bt));
        Main01Bean main01Bean2 = new Main01Bean("yecx", UIUtils.getDrawable(R.mipmap.yecx));
        Main01Bean main01Bean3 = new Main01Bean("yjkt", UIUtils.getDrawable(R.mipmap.yjkt));
        main01Beans2.add(main01Bean0);
        main01Beans2.add(main01Bean1);
        main01Beans2.add(main01Bean2);
        main01Beans2.add(main01Bean3);
        rlMain02.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        Main01Adapter main01Adapter = new Main01Adapter(main01Beans2);
        rlMain02.setAdapter(main01Adapter);
        rlMain02.addOnItemTouchListener(new com.chad.library.adapter.base.listener.OnItemClickListener() {
            @Override
            public void SimpleOnItemClick(BaseQuickAdapter baseQuickAdapter, View view, int position) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                UIUtils.showToast("暂未开放");
            }
        });
    }


    /**
     * 初始化轮播图
     *
     * @param loop_list
     */
    private void initloop(List<LoopListBean> loop_list) {
        //设置播放时间间隔
        rollViewPager.setPlayDelay(3000);
        //设置透明度
        rollViewPager.setAnimationDurtion(500);
        RollAdapter adapter = new RollAdapter(loop_list);
        rollViewPager.setAdapter(adapter);
        //设置指示器（顺序依次）
        //自定义指示器图片
        //设置圆点指示器颜色
        //设置文字指示器
        //隐藏指示器
        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));
//        mRollViewPager.setHintView(new ColorPointHintView(this, Color.YELLOW,Color.WHITE));
        rollViewPager.setHintView(new TextHintView(UIUtils.getContext()));
        rollViewPager.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

            }
        });
    }

    @Override
    protected BasePresenter createPresenter() {
        homePresenter = new HomePresenter(this);


        return homePresenter;
    }
}
