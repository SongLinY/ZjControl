package com.zj.sly.zjcontrol.User;

import android.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

/**
 * Created by asus on 2016/5/9.
 */
public class RegisterActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new RegisterFragment();
    }
}
