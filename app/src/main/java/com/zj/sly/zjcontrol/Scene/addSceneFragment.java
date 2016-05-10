package com.zj.sly.zjcontrol.Scene;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zj.sly.zjcontrol.R;

/**
 * Created by admin on 2016/4/2.
 */
public class addSceneFragment extends ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //生成fragment视图布局，然后将生产的View返回给托管的activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //是否将生产的视图添加给父视图
        View v = inflater.inflate(R.layout.fragment_add_sence,container,false);

        //添加函数

        return v;

    }
}
