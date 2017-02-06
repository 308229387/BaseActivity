package com.basefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SongYongmeng on 2017/2/6.
 */

public class FragmentA extends BaseFragment<FragmentAModel> {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initializationLayout(inflater, container);
        return model.getView();
    }

    private void initializationLayout(LayoutInflater inflater, ViewGroup container) {
        model.creatView(inflater, container);
        model.initView();
    }

    @Override
    protected FragmentAModel createModel() {
        return new FragmentAModel(this);
    }
}
