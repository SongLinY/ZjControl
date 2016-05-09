package com.zj.sly.zjcontrol.Setting;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zj.sly.zjcontrol.R;

/**
 * Created by LS on 2016/4/3.
 */
public class EditProfileFragment extends Fragment {
    private Toolbar mEditProfileToolBar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editprofile,container,false);

        mEditProfileToolBar = (Toolbar)view.findViewById(R.id.editProfileToolBar);
        mEditProfileToolBar.setTitle("编辑资料");
        return view;
    }
}
