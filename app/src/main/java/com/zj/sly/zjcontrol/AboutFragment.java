package com.zj.sly.zjcontrol;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LS on 2016/4/3.
 */
public class AboutFragment extends Fragment {

    //用于配置fragment实例
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
   //生成fragment视图布局，然后将生产的View返回给托管的activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //是否将生产的视图添加给父视图
        View view = inflater.inflate(R.layout.fragment_about,container,false);
        return view;

    }
}
