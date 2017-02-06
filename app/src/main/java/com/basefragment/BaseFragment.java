package com.basefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.BaseModel;

/**
 * Created by songyongmeng on 2017/2/6.
 */

public abstract class BaseFragment<T extends BaseModel> extends Fragment {
    protected T model;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initModel();
    }

    private void initModel() {
        model = createModel();
    }

    protected abstract T createModel();

}
