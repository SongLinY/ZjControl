package com.zj.sly.zjcontrol;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LS on 2016/4/3.
 */
public class UserInfoFragment extends Fragment {
    private Toolbar mUserInfoToolBar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_userinfo, container, false);
        mUserInfoToolBar = (Toolbar)view.findViewById(R.id.userInfo_toolBar);
        mUserInfoToolBar.setTitle("用户信息");
        mUserInfoToolBar.inflateMenu(R.menu.editmenu);
        return view;
    }

}
