package com.zj.sly.zjcontrol.Setting;



import android.support.v4.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

public class AboutActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new AboutFragment();
    }

}
