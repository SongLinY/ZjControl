package com.zj.sly.zjcontrol;


import android.app.Fragment;

/**
 * Created by Administrator on 2016/4/16.
 */
public class Air_condition_setting_activity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return new Air_condition_setting_fragment();
    }
}
