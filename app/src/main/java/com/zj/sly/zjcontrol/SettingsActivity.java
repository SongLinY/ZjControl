package com.zj.sly.zjcontrol;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

/**
 * Created by LS on 2016/4/3.
 */
public class SettingsActivity extends Activity {
    private ImageView mImageView;
    private Toolbar mSettingsToolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mSettingsToolBar.setTitle("设置");
        FragmentManager fm = getFragmentManager();
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
