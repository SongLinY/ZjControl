package com.zj.sly.zjcontrol.Home_page;



import android.support.v4.app.Fragment;

import com.zj.sly.zjcontrol.SingleFragmentActivity;

import java.security.Signature;

/**
 * Created by asus on 2016/5/23.
 */
public class HomePagerActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
       return new HomePagerFragment();
    }
}
