package com.example.administrator.project_2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/4/20.
 */
public class Setting_Fragment extends FragmentActivity
{
    private Button mMonitoring_Button;
    private Button mTelevision_Button;
    private Button mFreezer_Button;
    private Button mAir_condition_Button;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //电视机页面
        mTelevision_Button = (Button) findViewById(R.id.television_Button);
        mTelevision_Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("","");
            }
        });
        //空调页面
        mAir_condition_Button = (Button) findViewById(R.id.air_condition_Button);
        mAir_condition_Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("","");
            }
        });
        //冰箱页面
        mFreezer_Button = (Button) findViewById(R.id.freezer_Button);
        mFreezer_Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("","");
            }
        });
        //扫地机器人页面
        mMonitoring_Button = (Button) findViewById(R.id.monitoring_Button);
        mMonitoring_Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i("","");
            }
        });
    }

}
