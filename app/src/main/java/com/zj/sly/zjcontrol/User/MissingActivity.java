package com.zj.sly.zjcontrol.User;

import android.support.v4.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

/**
 * Created by asus on 2016/5/9.
 */
public class MissingActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new MissingFragment();
    }
}
