package com.zj.sly.zjcontrol.Scene;


import android.support.v4.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

public class addSceneActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new addSceneFragment();
    }
}
