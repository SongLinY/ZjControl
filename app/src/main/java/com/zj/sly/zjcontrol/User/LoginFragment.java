package com.zj.sly.zjcontrol.User;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.zj.sly.zjcontrol.MainActivity;
import com.zj.sly.zjcontrol.R;

import org.w3c.dom.Text;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

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
    private Button mLoginButton1;//跳转到注册界面
    private Button mLoginButton2;//跳转到忘记密码界面
    //
    private Button ONLYTEST;
    //登录界面toolbar
    private Toolbar mLoginToolBar;
    //返回按钮
    private ImageButton mLoginBackButton;
    //初始化变量
    private String userName;
    private String password;
    int selectIndex = 1;
    int tempSelect = selectIndex;
    boolean isReLogin = false;
    private int SERVER_FLAG = 0;
    private RelativeLayout countryselect;
    private TextView country_phone_sn,countryName;
    //
    private String []country_phone_sn_array,country_name_array;

    //进行消息的处理，使用handler
    public final static int LOGIN_ENABLE = 0x01;//注册完毕
    public final static int LOGIN_UNABLE = 0x02;//注册完毕
    public final static int PASS_ERROR = 0x03;//注册完毕
    public final static int NAME_ERROR = 0x04;//注册完毕

    final android.os.Handler UiMangerHandler = new android.os.Handler(){
        @Override
        public void handleMessage(Message msg){
            switch (msg.what){
                case LOGIN_ENABLE:
                    mLoginButton.setClickable(true);
                    break;
                case LOGIN_UNABLE:
                    mLoginButton.setClickable(false);
                    break;
                case PASS_ERROR:
                    break;
                case NAME_ERROR:
                    break;
            }
            super.handleMessage(msg);
        }
    };

    //初始化登录栏中的功能按钮
    private Button bt_username_clear;
    private Button bt_pwd_clear;
    private Button bt_pwd_eye;
    private TextWatcher username_watcher;
    private TextWatcher password_watcher;

    //主要记录用户会话过程中的一些用户的基本信息
    private HashMap<String,String> session = new HashMap<String,String>();
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

        mLoginUserPswEditText = (EditText) v.findViewById(R.id.user_password);

        bt_username_clear = (Button) v.findViewById(R.id.bt_username_clear);

        bt_pwd_clear = (Button) v.findViewById(R.id.bt_pwd_clear);
        initWatcher();
        bt_pwd_eye = (Button) v.findViewById(R.id.bt_pwd_eye);

        ONLYTEST = (Button) v.findViewById(R.id.registfer);
        ONLYTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mLoginBackButton = (ImageButton) v.findViewById(R.id.login_back_imageButton);
        mLoginBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),MainActivity.class);
                startActivity(i);
            }
        });

        mLoginButton = (Button) v.findViewById(R.id.login_button);

        //返回首页,并将用户信息传回
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            //进行用户名(name)和密码(psw)的验证，如果登录成功，则跳转
            // 不成功则弹出密码错误或用户名与密码不匹配
            //目前写死，之后从后台获取数据进行对比
            @Override
            public void onClick(View view) {
                if (checkUser()){
                    Toast.makeText(view.getContext(),"用户登录成功！",Toast.LENGTH_SHORT).show();
                    Context context = view.getContext();
                    Intent i = new Intent(context, MainActivity.class);

                    //传递session参数，在用户登录成功后为session初始化赋值，即传递HashMap的值

                    /*Bundle map = new Bundle();
                    map.putSerializable("sessioned",session);
                    i.putExtra("session",map);*/
                    context.startActivity(i);//成功跳转页面
                }
                else{
                    Toast.makeText(view.getContext(),"用户验证失败！",Toast.LENGTH_SHORT).show();
                }
            }

            private boolean checkUser(){
                userName = mLoginUserNameEditText.getText().toString();
                password = mLoginUserPswEditText.getText().toString();

                if(userName == "123" || password == "123456"){
                    return true;
                }else{
                    return false;
                }
               /* DefaultHttpClient mHttpClient = new DefaultHttpClient();
                HttpPost mPost = new HttpPost("http://10.0.2.2/web/php/login.php");
                //传递用户名和密码
                //http://10.0.2.2/web/php/login.php?userName="&password="

                List<BasicNameValuePair>pairs = new ArrayList<BasicNameValuePair>();

                pairs.add(new BasicNameValuePair("userName",userName));
                pairs.add(new BasicNameValuePair("password",password));

                try{
                    mPost.setEntity(new URLEncoderFormEntity(pairs,HTTP.UTF_8));
                }catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }

                try{
                    HttpResPonse response = mHttpClient.execute(mPost);

                    int res = response.getStatusLine().getStatusCode();
                    if (res == 200){
                        HttpEntity entity = response.getEntity();
                    }
                    if (entity != null){
                        String info
                    }
                }*/
            }
        });

        mLoginButton1 = (Button) v.findViewById(R.id.register_text);
        //跳转到注册界面
        mLoginButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), RegisterActivity.class);
                startActivity(i);
            }
        });

        mLoginButton2 = (Button) v.findViewById(R.id.missing_text);
        //跳转到忘记密码界面
        mLoginButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), MissingActivity.class);
                startActivity(i);
            }
        });
        //countryName.setText(country_name_array[selectIndex]);//默认为1

        //country_phone_sn.setText("+" + country_phone_sn_array[selectIndex]);

        return v;

    }

    private void initWatcher(){
        username_watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mLoginUserPswEditText.setText("");
                if (editable.toString().length()>0){
                    bt_username_clear.setVisibility(View.VISIBLE);
                }else{
                    bt_username_clear.setVisibility(View.INVISIBLE);
                }
            }
        };
        password_watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length()>0){
                    bt_pwd_clear.setVisibility(View.VISIBLE);
                }else{
                    bt_pwd_clear.setVisibility(View.INVISIBLE);
                }
            }
        };
    }

}
