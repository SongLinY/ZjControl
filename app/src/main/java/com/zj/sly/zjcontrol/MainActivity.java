package com.zj.sly.zjcontrol;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        Fragment fragment;
        fragment = fm.findFragmentById(R.id.fragmentContainer);

        if(fragment == null){
            fragment = new MainFragment();
            fm.beginTransaction().add(R.id.fragmentContainer,fragment).commit();
        }else{
            //什么都不做
        }
    }
}
