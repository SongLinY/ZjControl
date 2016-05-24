package com.zj.sly.zjcontrol.Home_page;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.zj.sly.zjcontrol.R;

/**
 * Created by Administrator on 2016/4/20.
 */
public class Air_condition_setting_fragment extends Fragment
{
    private Button mModel_Button;
    private Button mAdd_temperature_Button;
    private Button mReduce_temperature_Button;
    private ImageButton mBegin_ImageButton;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.air_condition_setting, parent, false);

        //按钮点击事件
        mModel_Button = (Button)view.findViewById(R.id.model_Button);
        mModel_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("模式设置的点击事件", "");
            }
        });
        mAdd_temperature_Button = (Button)view.findViewById(R.id.add_temperature_Button);
        mAdd_temperature_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("温度+的点击事件", "");
            }
        });
        mReduce_temperature_Button = (Button)view.findViewById(R.id.reduce_temperature_Button);
        mReduce_temperature_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("温度-的点击事件", "");
            }
        });
        mBegin_ImageButton = (ImageButton)view.findViewById(R.id.begin_ImageButton);
        mBegin_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("开启空调的点击事件", "");
            }
        });

        return view;
    }
}
