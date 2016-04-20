package com.zj.sly.zjcontrol;


import android.app.Fragment;

/**
 * Created by Administrator on 2016/4/16.
 */
public class Monitoring_setting_activity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return new Monitoring_setting_fragment();
    }
}
