package com.zj.sly.zjcontrol.Setting;

import android.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

public class AboutActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new AboutFragment();
    }

}
