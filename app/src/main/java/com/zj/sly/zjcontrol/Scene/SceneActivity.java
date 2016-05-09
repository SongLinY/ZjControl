package com.zj.sly.zjcontrol.Scene;

import android.app.Fragment;

import com.zj.sly.zjcontrol.Setting.AboutFragment;
import com.zj.sly.zjcontrol.SingleFragmentActivity;

/**
 * Created by asus on 2016/5/4.
 */
public class SceneActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new SceneFragment();
    }

}
