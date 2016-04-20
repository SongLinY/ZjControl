package com.zj.sly.zjcontrol;

import android.app.Activity;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;


/**
 * Created by Administrator on 2016/4/20.
 */
public abstract class SingleFragmentActivity extends Activity
{
    protected abstract Fragment createFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if (fragment == null)
        {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragmentContainer,fragment).commit();
        }
    }
}
