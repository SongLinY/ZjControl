package com.example.administrator.project_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016/4/20.
 */
public class Freezer_setting_fragment extends Fragment
{
    private Button mAdd_temperature_Button;
    private Button mReduce_temperature_Button;
    private ImageButton mStart_ImageButton;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.freezer_setting,parent,false);

        //按钮点击事件
        mAdd_temperature_Button = (Button)view.findViewById(R.id.add_temperature_Button);
        mAdd_temperature_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("温度+的点击事件", "");
            }
        });
        mReduce_temperature_Button = (Button)view.findViewById(R.id.add_temperature_Button);
        mReduce_temperature_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("温度-的点击事件", "");
            }
        });
        mStart_ImageButton = (ImageButton)view.findViewById(R.id.start_ImageButton);
        mStart_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("冰箱开机的点击事件", "");
            }
        });

        return view;
    }
}
