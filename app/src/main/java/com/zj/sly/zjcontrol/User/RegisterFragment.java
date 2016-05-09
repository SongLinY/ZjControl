package com.zj.sly.zjcontrol.User;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.zj.sly.zjcontrol.R;

/**
 * Created by asus on 2016/5/9.
 */
public class RegisterFragment extends Fragment{
    //注册界面五个输入框
    private EditText mRegisternumEditText;
    private EditText mRegisterVcodeEditText;
    private EditText mRegisterNameEditText;
    private EditText mRegisterPsw1EditText;
    private EditText mRegisterPsw2EditText;
    //验证手机按钮
    private Button mVerifyButton;
    //注册按钮
    private Button mRegisterButton;
    //
    private CheckBox mRegisterCheckBox;
    //登录界面toolbar
    private Toolbar mRegisterToolBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    //生成fragment视图布局，然后将生产的View返回给托管的activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //是否将生产的视图添加给父视图
        View v = inflater.inflate(R.layout.register_layout,container,false);
        mRegisterToolBar = (Toolbar)v.findViewById(R.id.registerToolBar);

        mRegisternumEditText = (EditText) v.findViewById(R.id.register_number);

        mRegisterVcodeEditText = (EditText) v.findViewById(R.id.register_verification_code);

        mRegisterNameEditText = (EditText) v.findViewById(R.id.register_name);

        mRegisterPsw1EditText = (EditText) v.findViewById(R.id.register_password1);

        mRegisterPsw2EditText = (EditText) v.findViewById(R.id.register_password2);

        mVerifyButton = (Button) v.findViewById(R.id.verify_button);

        mRegisterButton = (Button) v.findViewById(R.id.register_button);

        mRegisterCheckBox = (CheckBox) v.findViewById(R.id.register_checkBox);


        return v;

    }
}
