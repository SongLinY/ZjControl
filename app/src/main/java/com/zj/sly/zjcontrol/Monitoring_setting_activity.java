package com.example.administrator.project_2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016/4/16.
 */
public class Monitoring_setting_activity extends Activity
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
        setContentView(R.layout.monitoring_setting);

        //按钮点击事件
        mStart_monitoring_ImageButton = (ImageButton)findViewById(R.id.start_monitoring_ImageButton);
        mStart_monitoring_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("机器人开始扫地的点击事件", "");
            }
        });
        mLeft_ImageButton = (ImageButton)findViewById(R.id.left_ImageButton);
        mLeft_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向左的点击事件", "");
            }
        });
        mRight_ImageButton = (ImageButton)findViewById(R.id.right_ImageButton);
        mRight_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向右的点击事件", "");
            }
        });
        mUp_ImageButton = (ImageButton)findViewById(R.id.up_ImageButton);
        mUp_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向上的点击事件", "");
            }
        });
        mDown_ImageButton = (ImageButton)findViewById(R.id.down_ImageButton);
        mDown_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向下的点击事件", "");
            }
        });
    }


}
