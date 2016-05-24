package com.zj.sly.zjcontrol.Setting;

import android.support.v4.app.FragmentActivity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.zj.sly.zjcontrol.R;

/**
 * Created by LS on 2016/4/3.
 */
public class SettingsActivity extends FragmentActivity {
    private ImageView mImageView;
    private Toolbar mSettingsToolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

       // mSettingsToolBar.setTitle("设置");
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.settings_container);
        if (fragment == null){
            fragment = new SettingsFragment();
            fm.beginTransaction()
                    .add(R.id.settings_container,fragment)
                    .commit();
        }

        mImageView = (ImageView)findViewById(R.id.user_imageview);
        mImageView.setImageResource(R.drawable.userlog);
    }
}
