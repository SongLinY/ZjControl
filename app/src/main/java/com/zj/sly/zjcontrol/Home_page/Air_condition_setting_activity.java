package com.zj.sly.zjcontrol.Home_page;




import android.support.v4.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

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
