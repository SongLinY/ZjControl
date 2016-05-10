package com.zj.sly.zjcontrol.User;

import android.app.Fragment;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.zj.sly.zjcontrol.R;

import java.util.HashMap;
import java.util.Map;

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
    //定义变量
    private String userName;
    private String passWord;
    public boolean isChange = false;
    private boolean tag = true;
    private int i = 60;
    Thread thread = null;
    //客户端输入的验证码
    private String valicationCode;
    //服务器端获取的验证码
    private static String serverValicationCode;
    //注册时所带的参数
    private Map<String,Object> registerParams = new HashMap<String,Object>();
    //获取验证码时所带的参数
    private Map<String,Object> codeParams = new HashMap<String,Object>();
    //注册是否成功
    private String registerStatus;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    //生成fragment视图布局，然后将生产的View返回给托管的activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //是否将生产的视图添加给父视图
        View v = inflater.inflate(R.layout.register_layout,container,false);
        //初始化控件
        mRegisterToolBar = (Toolbar)v.findViewById(R.id.registerToolBar);

        mRegisternumEditText = (EditText) v.findViewById(R.id.register_number);

        mRegisterVcodeEditText = (EditText) v.findViewById(R.id.register_verification_code);

        mRegisterNameEditText = (EditText) v.findViewById(R.id.register_name);

        mRegisterPsw1EditText = (EditText) v.findViewById(R.id.register_password1);

        mRegisterPsw2EditText = (EditText) v.findViewById(R.id.register_password2);

        mVerifyButton = (Button) v.findViewById(R.id.verify_button);

        mRegisterButton = (Button) v.findViewById(R.id.register_button);

        mRegisterCheckBox = (CheckBox) v.findViewById(R.id.register_checkBox);

        /*
        //初始化监听事件
        mVerifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mVerifyButton.setText("获取验证码");
                mVerifyButton.setClickable(true);
                isChange = true;
                changeBtnGetCode();
                getValidateCode();
            }
        });
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });*/

        return v;
    }
    /*
    private boolean isvalidate(){
        //获取控件输入的值
        String userNum = mRegisternumEditText.getText().toString().trim();
        if (StringUtils.isEmpty(userNum)){
            Toast.makeText(getActivity(),"手机号不能为空",Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!StringUtils.isPhoneNumberValid(userNum)){
            Toast.makeText(getActivity(),"手机号有误",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }*/

    /*
    private  void changeBtnGetCode(){
        thread = new Thread(){
            @Override
            public void run(){
                if (tag){
                    while (i>0){
                        i--;
                        if (getActivity() == null){
                            break;
                        }
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                mVerifyButton.setText("获取验证码(" + i + ")");
                                mVerifyButton.setClickable(false);
                            }
                        });
                        try{
                            Thread.sleep(1000);
                        }catch (InterruptedException e){
                            throw new RuntimeException(e);
                        }
                    }
                    tag = false;
                }
                i = 60;
                tag = true;
                if (getActivity() != null){
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mVerifyButton.setText("获取验证码");
                            mVerifyButton.setClickable(true);
                        }
                    });
                }
            }
        };
        thread.start();
    }*/

    /*
    //获取验证码
    public boolean getValidateCode(){
        String name = mRegisterNameEditText.getText().toString().trim();
        String code = mRegisterVcodeEditText.getText().toString().trim();
        if (name.equals("")){
            Toast.makeText(getActivity(),"请输入用户名！",Toast.LENGTH_SHORT).show();
            return false;
        }else{
            userName = name;
            valicationCode = code;
            Thread codeThread = new Thread(codeRunnable);
            codeThread.start();
        }
        return true;
    }*/

    /*
    //注册
    public void register(){
        //首先判断输入的值是否有效
        //然后判断输入的验证码是否有效（防止没有点击获取验证码自己填的错误验证码）
        //左后注册
        if (isValid()){
            if (valicationCode.equals(serverValicationCode)){
                Thread thread = new Thread(sRunnable);
                thread.start();
            }else{
                Toast.makeText(getActivity(),"输入的验证码不正确！",Toast.LENGTH_SHORT).show();
            }
        }
    }
    */
    //

    //获取验证码
    /*public static String getValidateCode(AppContext appContext, Map<String,Object> map) throws OperationApplicationException{
        //定义要访问的接口和要强转的实体
        String validateUrl = _MakeURL(URLs.VALIDATE_CODE_URL,map);
        ValidateCode validateCode = null;
        try{
            //获取服务器端Json数据
            String json = http_get(appContext,validateUrl);

            //解析为指定的实体对象
            validateCode = (validateCode) JSON.parseObject
        }
    }*/
}
