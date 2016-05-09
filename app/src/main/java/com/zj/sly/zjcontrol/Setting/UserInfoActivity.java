package com.zj.sly.zjcontrol.Setting;

import android.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

/**
 * Created by LS on 2016/4/3.
 */
public class UserInfoActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new UserInfoFragment();
    }
}
