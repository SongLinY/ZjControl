package com.zj.sly.zjcontrol.Home_page;




import android.support.v4.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

public class Television_setting_activity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return new Television_setting_fragment();
    }
}
