package com.basefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.BaseModel;
import com.example.songyongmeng.baseactivity.R;

/**
 * Created by songyongmeng on 2017/2/6.
 */
public class FragmentAModel extends BaseModel {
    private FragmentA context;
    private View showLayout;


    public FragmentAModel(FragmentA context) {
        this.context = context;
    }

    public View getView() {
        return showLayout;
    }

    public void creatView(LayoutInflater inflater, ViewGroup container) {
        showLayout =
                inflater.inflate(R.layout.fragmenta_layout, container, false);
    }

    public void initView() {
        TextView t = (TextView)showLayout.findViewById(R.id.text);
        t.setText("fragmentaaaaa");
    }
}
