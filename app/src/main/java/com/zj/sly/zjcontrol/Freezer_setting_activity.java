package com.example.administrator.project_2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;

/**
 * Created by Administrator on 2016/4/16.
 */
public class Freezer_setting_activity extends Activity
{
    private Button mAdd_temperature_Button;
    private Button mReduce_temperature_Button;
    private ImageButton mStart_ImageButton;
    //按钮点击事件
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.freezer_setting);
        //按钮点击事件
        mAdd_temperature_Button = (Button)findViewById(R.id.add_temperature_Button);
        mAdd_temperature_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("温度+的点击事件", "");
            }
        });
        mReduce_temperature_Button = (Button)findViewById(R.id.add_temperature_Button);
        mReduce_temperature_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("温度-的点击事件", "");
            }
        });
        mStart_ImageButton = (ImageButton)findViewById(R.id.start_ImageButton);
        mStart_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("冰箱开机的点击事件", "");
            }
        });
    }
}
