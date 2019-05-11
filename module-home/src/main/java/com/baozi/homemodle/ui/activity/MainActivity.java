package com.baozi.homemodle.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.baozi.homemodle.R;
import com.baozi.mvp.presenter.BasePresenter;
import com.baozi.mvp.presenter.EmptyPresenter;
import com.baozi.mvp.tempalet.TemplateActivity;


public class MainActivity extends TemplateActivity<BasePresenter> {
    @Override
    protected void init(@Nullable Bundle savedInstanceState) {
        super.init(savedInstanceState);
    }

    @Override
    protected int initView(Bundle savedInstanceState) {
        return R.layout.home_activity_main;
    }

    //这里偷懒,就不去单独写个PresenterImpl了
    @Override
    protected BasePresenter initPresenter() {
        return new EmptyPresenter();
    }

    @Override
    public int getToolbarLayout() {
        return 0;
    }
}
