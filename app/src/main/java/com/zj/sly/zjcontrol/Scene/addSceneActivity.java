package com.zj.sly.zjcontrol.Scene;


import android.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

public class addSceneActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new addSceneFragment();
    }
}
