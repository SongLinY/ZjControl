package com.zj.sly.zjcontrol.Setting;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.zj.sly.zjcontrol.R;

/**
 * Created by Administrator on 2016/4/20.
 */
public class Monitoring_setting_fragment extends Fragment
{
    private ImageButton mStart_monitoring_ImageButton;
    private ImageButton mLeft_ImageButton;
    private ImageButton mRight_ImageButton;
    private ImageButton mUp_ImageButton;
    private ImageButton mDown_ImageButton;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.monitoring_setting,parent,false);

        //按钮点击事件
        mStart_monitoring_ImageButton = (ImageButton)view.findViewById(R.id.start_monitoring_ImageButton);
        mStart_monitoring_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("机器人开始扫地的点击事件", "");
            }
        });
        mLeft_ImageButton = (ImageButton)view.findViewById(R.id.left_ImageButton);
        mLeft_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向左的点击事件", "");
            }
        });
        mRight_ImageButton = (ImageButton)view.findViewById(R.id.right_ImageButton);
        mRight_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向右的点击事件", "");
            }
        });
        mUp_ImageButton = (ImageButton)view.findViewById(R.id.up_ImageButton);
        mUp_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向上的点击事件", "");
            }
        });
        mDown_ImageButton = (ImageButton)view.findViewById(R.id.down_ImageButton);
        mDown_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向下的点击事件", "");
            }
        });
        return view;
    }

}
