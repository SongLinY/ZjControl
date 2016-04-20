package com.example.administrator.project_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Television_setting_activity extends FragmentActivity
{
    private Button mAdd_yinliang_Button;
    private Button mReduce_yinliang_Button;
    private ImageButton mVoice_stop_Button;
    private Button mAdd_pindao_Button;
    private Button mReduce_pindao_Button;
    private Button mStart_television_Button;
    private Button mWait_Button;
    private Button mReturnButton;
    private ImageButton mMenu_ImageButton;
    private ImageButton mTop_float_ImageButton;
    private ImageButton mDown_float_ImageButton;
    private ImageButton mRight_float_ImageButton;
    private ImageButton mLeft_float_ImageButton;

    //按钮点击事件
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.television_setting);

        mAdd_pindao_Button = (Button)findViewById(R.id.add_pindao_Button);
        mAdd_pindao_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("频道+的点击事件", "");
            }
        });
        mReduce_pindao_Button = (Button)findViewById(R.id.reduce_pindao_Button);
        mReduce_pindao_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("频道-的点击事件", "");
            }
        });
        mVoice_stop_Button = (ImageButton)findViewById(R.id.voice_stop_Button);
        mVoice_stop_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("屏蔽音量的点击事件", "");
            }
        });
        mAdd_yinliang_Button = (Button)findViewById(R.id.add_yinliang_Button);
        mAdd_yinliang_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("音量+的点击事件", "");
            }
        });
        mReduce_yinliang_Button = (Button)findViewById(R.id.reduce_yinliang_Button);
        mReduce_yinliang_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("音量-的点击事件", "");
            }
        });
        mStart_television_Button = (Button)findViewById(R.id.start_television_Button);
        mStart_television_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("电视开机的点击事件", "");
            }
        });
        mWait_Button = (Button)findViewById(R.id.wait_Button);
        mWait_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("电视待机的点击事件", "");
            }
        });
        mReturnButton = (Button)findViewById(R.id.return_Button);
        mReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("返回的点击事件", "");
            }
        });
        mMenu_ImageButton = (ImageButton)findViewById(R.id.menu_ImageButton);
        mMenu_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("菜单的点击事件", "");
            }
        });
        mTop_float_ImageButton = (ImageButton)findViewById(R.id.top_float_ImageButton);
        mTop_float_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向上的点击事件", "");
            }
        });
        mDown_float_ImageButton = (ImageButton)findViewById(R.id.down_float_ImageButton);
        mDown_float_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向下的点击事件", "");
            }
        });
        mLeft_float_ImageButton = (ImageButton)findViewById(R.id.left_float_ImageButton);
        mLeft_float_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向左的点击事件", "");
            }
        });
        mRight_float_ImageButton = (ImageButton)findViewById(R.id.right_float_ImageButton);
        mRight_float_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向右的点击事件", "");
            }
        });
    }

}
