package com.example.administrator.project_2;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2016/4/16.
 */
public class Air_condition_setting_activity extends SingleFragmentActivity
{
    @Override
    protected Fragment create_Fragment()
    {
        return new Air_condition_setting_fragment();
    }
}
