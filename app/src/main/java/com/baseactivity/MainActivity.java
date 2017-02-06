package com.baseactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.songyongmeng.baseactivity.R;

public class MainActivity extends BaseActivity<MainModel> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model.showToast("im toast");
    }


    @Override
    public MainModel createModel() {
        return new MainModel(this);
    }
}
