package com.baseactivity;

import android.widget.Toast;

/**
 * Created by songyongmeng on 2017/2/6.
 */
public class MainModel extends BaseModel {
    private final MainActivity context;

    public MainModel(MainActivity context) {
        this.context = context;
    }

    public void showToast(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
