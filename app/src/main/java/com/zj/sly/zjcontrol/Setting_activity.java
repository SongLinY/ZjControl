package com.example.administrator.project_2;

import android.support.v4.app.Fragment;

public class Setting_activity extends SingleFragmentActivity
{
    //页面跳转
    @Override
    protected Fragment create_Fragment()
    {
        return new Setting_Fragment();
    }
}
