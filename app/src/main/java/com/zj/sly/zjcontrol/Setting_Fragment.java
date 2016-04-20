package com.zj.sly.zjcontrol;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Administrator on 2016/4/20.
 */
public class Setting_Fragment extends Fragment
{
    private Button mMonitoring_Button;
    private Button mTelevision_Button;
    private Button mFreezer_Button;
    private Button mAir_condition_Button;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.activity_setting,parent,false);
        //电视机页面
        mTelevision_Button = (Button) view.findViewById(R.id.television_Button);
        mTelevision_Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("","");
            }
        });
        //空调页面
        mAir_condition_Button = (Button) view.findViewById(R.id.air_condition_Button);
        mAir_condition_Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("","");
            }
        });
        //冰箱页面
        mFreezer_Button = (Button) view.findViewById(R.id.freezer_Button);
        mFreezer_Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("","");
            }
        });
        //扫地机器人页面
        mMonitoring_Button = (Button) view.findViewById(R.id.monitoring_Button);
        mMonitoring_Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("","");
            }
        });
        return view;
    }

}
