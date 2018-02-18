package com.xialan.baoyin.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xialan.baoyin.R;
import com.xialan.baoyin.base.BaseActivity;
import com.xialan.baoyin.base.BasePresenter;
import com.xialan.baoyin.commonutil.UIUtils;
import com.xialan.baoyin.contract.SearchOrderContract;
import com.xialan.baoyin.presenter.SearchOrderPresenter;
import com.xialan.baoyin.ui.CustomDatePicker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/12.
 */

public class SearchOrderActivity extends BaseActivity implements SearchOrderContract.View {


    @BindView(R.id.tv_start_time)
    TextView tvStartTime;
    @BindView(R.id.tv_end_time)
    TextView tvEndTime;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_state)
    TextView tvState;
    @BindView(R.id.tv_fendian)
    TextView tvFendian;
    @BindView(R.id.tv_staff)
    TextView tvStaff;
    @BindView(R.id.btn_search)
    Button btnSearch;
    @BindView(R.id.rl_return)
    RelativeLayout rlReturn;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    private SearchOrderPresenter searchOrderPresenter;
    private CustomDatePicker customDatePicker2;
    private boolean isStart;

    @Override
    protected int setlayoutID() {
        return R.layout.activity_searchorder;
    }

    @Override
    protected void initData() {
        tvTitle.setText("查账功能");
        initDatePicker();
        rlReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected BasePresenter createPresenter() {
        searchOrderPresenter = new SearchOrderPresenter(this);
        return searchOrderPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_start_time, R.id.tv_end_time, R.id.tv_type, R.id.tv_state, R.id.tv_fendian, R.id.tv_staff, R.id.btn_search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_start_time:
                isStart = true;
                customDatePicker2.show("2018-1-17 0:0");
                break;
            case R.id.tv_end_time:
                isStart = false;
                customDatePicker2.show("2018-1-17 0:0");
                break;
            case R.id.tv_type:
                break;
            case R.id.tv_state:
                break;
            case R.id.tv_fendian:
                break;
            case R.id.tv_staff:
                break;
            case R.id.btn_search:
                break;
        }
    }


    private void initDatePicker() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA);
        String now = sdf.format(new Date());
        tvStartTime.setText(now.split(" ")[0]);
        tvStartTime.setText(now);
        customDatePicker2 = new CustomDatePicker(this, new CustomDatePicker.ResultHandler() {
            @Override
            public void handle(String time) { // 回调接口，获得选中的时间
                if (isStart) {
                    tvStartTime.setText(time);
                } else {
                    tvEndTime.setText(time);
                }
            }
        }, "2010-01-01 00:00", tvStartTime.getText().toString()); // 初始化日期格式请用：yyyy-MM-dd HH:mm，否则不能正常运行
        customDatePicker2.showSpecificTime(true); // 显示时和分
        customDatePicker2.setIsLoop(true); // 允许循环滚动
    }

}
