package com.zj.sly.zjcontrol;


import android.app.Fragment;

public class Television_setting_activity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return new Television_setting_fragment();
    }
}
