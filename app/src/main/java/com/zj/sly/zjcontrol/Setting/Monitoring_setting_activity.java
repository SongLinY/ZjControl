package com.zj.sly.zjcontrol.Setting;


import android.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

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
