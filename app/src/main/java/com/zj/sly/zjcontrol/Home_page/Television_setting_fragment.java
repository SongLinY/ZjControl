package com.zj.sly.zjcontrol.Home_page;

import android.support.v4.app.Fragment;
import android.os.Bundle;
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
public class Television_setting_fragment extends Fragment
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
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.television_setting,parent,false);

        mAdd_pindao_Button = (Button)view.findViewById(R.id.add_pindao_Button);
        mAdd_pindao_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("频道+的点击事件", "");
            }
        });
        mReduce_pindao_Button = (Button)view.findViewById(R.id.reduce_pindao_Button);
        mReduce_pindao_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("频道-的点击事件", "");
            }
        });
        mVoice_stop_Button = (ImageButton)view.findViewById(R.id.voice_stop_Button);
        mVoice_stop_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("屏蔽音量的点击事件", "");
            }
        });
        mAdd_yinliang_Button = (Button)view.findViewById(R.id.add_yinliang_Button);
        mAdd_yinliang_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("音量+的点击事件", "");
            }
        });
        mReduce_yinliang_Button = (Button)view.findViewById(R.id.reduce_yinliang_Button);
        mReduce_yinliang_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("音量-的点击事件", "");
            }
        });
        mStart_television_Button = (Button)view.findViewById(R.id.start_television_Button);
        mStart_television_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("电视开机的点击事件", "");
            }
        });
        mWait_Button = (Button)view.findViewById(R.id.wait_Button);
        mWait_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("电视待机的点击事件", "");
            }
        });
        mReturnButton = (Button)view.findViewById(R.id.return_Button);
        mReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("返回的点击事件", "");
            }
        });
        mMenu_ImageButton = (ImageButton)view.findViewById(R.id.menu_ImageButton);
        mMenu_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("菜单的点击事件", "");
            }
        });
        mTop_float_ImageButton = (ImageButton)view.findViewById(R.id.top_float_ImageButton);
        mTop_float_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向上的点击事件", "");
            }
        });
        mDown_float_ImageButton = (ImageButton)view.findViewById(R.id.down_float_ImageButton);
        mDown_float_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向下的点击事件", "");
            }
        });
        mLeft_float_ImageButton = (ImageButton)view.findViewById(R.id.left_float_ImageButton);
        mLeft_float_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向左的点击事件", "");
            }
        });
        mRight_float_ImageButton = (ImageButton)view.findViewById(R.id.right_float_ImageButton);
        mRight_float_ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("向右的点击事件", "");
            }
        });

        return view;
    }
}
