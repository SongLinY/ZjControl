package com.zj.sly.zjcontrol;

import android.app.Fragment;

/**
 * Created by LS on 2016/4/3.
 */
public class UserInfoActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new UserInfoFragment();
    }
}
