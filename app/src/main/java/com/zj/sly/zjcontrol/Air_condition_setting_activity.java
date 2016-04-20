package com.example.administrator.project_2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016/4/16.
 */
public class Air_condition_setting_activity extends Activity
{
    private Button mModel_Button;
    private Button mAdd_temperature_Button;
    private Button mReduce_temperature_Button;
    private ImageButton mBegin_ImageButton;
    //按钮点击事件
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.air_condition_setting);
        //按钮点击事件
        mModel_Button = (Button)findViewById(R.id.model_Button);
        mModel_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("模式设置的点击事件", "");
            }
        });
        mAdd_temperature_Button = (Button)findViewById(R.id.add_temperature_Button);
        mAdd_temperature_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("温度+的点击事件", "");
            }
        });
        mReduce_temperature_Button = (Button)findViewById(R.id.reduce_temperature_Button);
        mReduce_temperature_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("温度-的点击事件", "");
            }
        });
        mBegin_ImageButton = (ImageButton)findViewById(R.id.begin_ImageButton);
        mBegin_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("开启空调的点击事件", "");
            }
        });

    }

}
