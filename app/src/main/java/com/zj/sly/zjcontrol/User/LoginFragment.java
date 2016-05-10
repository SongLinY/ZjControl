package com.zj.sly.zjcontrol.User;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zj.sly.zjcontrol.MainActivity;
import com.zj.sly.zjcontrol.R;

import org.w3c.dom.Text;

/**
 * Created by asus on 2016/5/9.
 */
public class LoginFragment extends Fragment{
    //登录界面两个输入框
    private EditText mLoginUserNameEditText;
    private EditText mLoginUserPswEditText;
    //登录按钮
    private Button mLoginButton;
    //两个用于跳转的TextView
    private TextView mLoginTextView1;//跳转到注册界面
    private TextView mLoginTextView2;//跳转到忘记密码界面
    //登录界面toolbar
    private Toolbar mLoginToolBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    //生成fragment视图布局，然后将生产的View返回给托管的activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //是否将生产的视图添加给父视图
        View v = inflater.inflate(R.layout.login_layout,container,false);
        mLoginToolBar = (Toolbar)v.findViewById(R.id.loginToolBar);

        mLoginUserNameEditText = (EditText) v.findViewById(R.id.user_name);
        String name = mLoginUserNameEditText.getText().toString();
        mLoginUserPswEditText = (EditText) v.findViewById(R.id.user_password);
        String psw = mLoginUserPswEditText.getText().toString();
        mLoginButton = (Button) v.findViewById(R.id.login_button);
        //返回首页,并将用户信息传回
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            //进行用户名(name)和密码(psw)的验证，如果登录成功，则跳转
            // 不成功则弹出密码错误或用户名与密码不匹配
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
            }
        });

        mLoginTextView1 = (TextView) v.findViewById(R.id.register_text);
        //跳转到注册界面
        mLoginTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), RegisterActivity.class);
                startActivity(i);
            }
        });

        mLoginTextView2 = (TextView) v.findViewById(R.id.missing_text);
        //跳转到忘记密码界面
        mLoginTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), MissingActivity.class);
                startActivity(i);
            }
        });

        return v;

    }
}
