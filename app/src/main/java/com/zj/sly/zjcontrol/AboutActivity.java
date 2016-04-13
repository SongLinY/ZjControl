package com.zj.sly.zjcontrol;

import android.app.Fragment;

public class AboutActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new AboutFragment();
    }

}
