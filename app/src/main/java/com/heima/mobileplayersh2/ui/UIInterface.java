package com.heima.mobileplayersh2.ui;

import android.view.View;

/**
 * Created by Administrator on 2015/11/13.
 */
public interface UIInterface {


    /**
     * 返回当前Activity使用的布局id
     */
    int getLayoutId();

    /**
     * 执行findViewById操作
     */
    void initView();

    /**
     * 注册监听器、适配器
     */
    void initListener();

    /**
     * 获取数据，初始化界面
     */
    void initData();

    /**
     * 在BaseActivity没有处理的点击事件，在此处处理
     */
    void processClick(View v);
}
