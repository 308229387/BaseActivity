package com.baseactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * Created by songyongmeng on 2017/2/6.
 */

public abstract class BaseActivity<T extends BaseModel> extends FragmentActivity {
    protected T model;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initModel();
    }

    private void initModel() {
        model = createModel();
    }

    public abstract T createModel();


}
