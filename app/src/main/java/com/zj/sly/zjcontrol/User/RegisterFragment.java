package com.zj.sly.zjcontrol.User;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.zj.sly.zjcontrol.R;

import java.lang.ref.WeakReference;
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
    //返回按钮
    private ImageButton mRegisterBackButton;
    //定义变量
    private String userName;
    private String passWord1;
    private String passWord2;
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

        mRegisterBackButton = (ImageButton) v.findViewById(R.id.register_back_imageButton);
        mRegisterBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),LoginActivity.class);
                startActivity(i);
            }
        });


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
    }


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
    }


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
    }


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

    //--------------------------------获取验证码线程处理过程---开始-----------------------------
    /**
     * 自定义一个静态的具有弱引用的Handler，解决内存泄漏的问题,本handler用来获取验证码
     */
    /*
    private static class CodeHandler extends Handler {
        // 持有对本外部类的弱引用
        private final WeakReference<RegisterActivity> mActivity;
        public CodeHandler(RegisterActivity activity) {
            mActivity = new WeakReference<RegisterActivity>(activity);
        }
        @Override
        public void handleMessage(Message msg) {
            // 获取上下文对象
            RegisterActivity activity = mActivity.get();
            if (activity != null) {
                switch (msg.what) {
                    case 1:
                        serverValicationCode = (String)msg.obj;
                        //activity.etCode.setText(serverValicationCode);
                        break;
                    case -1:
                        Toast.makeText(activity, "获取验证码失败!", Toast.LENGTH_SHORT).show();
                        break;
                    case 0:
                        Toast.makeText(activity, "哎呀,出错啦..", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        }
    }
    /**实例化自定义的handler*/
    /*
    private final CodeHandler codeHandler = new CodeHandler(this);
    private String serverCode=null;
    /**定义获取验证码的子线程*/
    /*
    private Runnable codeRunnable = new Runnable() {
        @Override
        public void run() {
            Message msg = new Message();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("jbPhone", userName);
            // 获取全局对象Application
            AppContext appContext = (AppContext) getApplication();
            try {
                // 获取服务器数据
                serverValicationCode = appContext.getCode(map);
                // 返回true则将消息的what值为1，为false则what为-1，异常为0
                if (serverValicationCode.equals("")) {
                    msg.what = -1;
                } else {
                    msg.what = 1;
                    msg.obj = serverValicationCode;
                }
            } catch (AppException e) {
                msg.what = 0;
                e.printStackTrace();
            }
            codeHandler.sendMessage(msg);
        }
    };

    //--------------------------------获取验证码线程处理过程----完成------------------------------
    //--------------------------------注册线程处理过程--开始----------------------------------
    /**
     * 自定义一个静态的具有弱引用的Handler，解决内存泄漏的问题，注册使用
     */
    /*
    private static class MyHandler extends Handler {
        // 持有对本外部类的弱引用
        private final WeakReference<RegisterActivity> mActivity;

        public MyHandler(RegisterActivity activity) {
            mActivity = new WeakReference<RegisterActivity>(activity);
        }
        @Override
        public void handleMessage(Message msg) {

            // 获取上下文对象
            RegisterActivity activity = mActivity.get();
            if (activity != null) {
                switch (msg.what) {
                    case 1:
                        Toast.makeText(activity, "注册成功!", Toast.LENGTH_SHORT).show();
                        activity.finish();
                        break;
                    case -1:
                        Toast.makeText(activity, "注册失败!", Toast.LENGTH_SHORT).show();
                        break;
                    case -2:
                        Toast.makeText(activity, "该号已经注册!", Toast.LENGTH_SHORT).show();
                        break;
                    case 0:
                        Toast.makeText(activity, "哎呀,出错啦..", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        }
    }
    /**实例化自定义的handler*/
    /*
    private final MyHandler mHandler = new MyHandler(this);
    /**自定义子线程*/
    /*
    private Runnable sRunnable = new Runnable() {
        @Override
        public void run() {
            Message msg = new Message();
            // 获取全局对象Application
            AppContext appContext = (AppContext) getApplication();
            try {
                // 获取服务器数据
                regisgerStatus = appContext.register(registerParams);

                // 返回true则将消息的what值为1，为false则what为-1，异常为0
                if (regisgerStatus.equals("true")) {
                    msg.what = 1;
                    msg.obj = regisgerStatus;
                } else if(regisgerStatus.equals("1")){
                    msg.what = -2;
                }else if(regisgerStatus.equals("false")){
                    msg.what = -1;}
            } catch (AppException e) {
                msg.what = 0;
                e.printStackTrace();
            }
            mHandler.sendMessage(msg);
        }
    };

    //--------------------------------注册线程处理过程---完成-----------------------------------
    /**
     * 说明：注册之前判断数据是否为空
     */
    /*
    public boolean isValid() {
        userName = mRegisterNameEditText.getText().toString().trim();
        valicationCode = mRegisterVcodeEditText.getText().toString().trim();
        passWord1 = mRegisterPsw1EditText.getText().toString().trim();
        passWord2 = mRegisterPsw1EditText.getText().toString().trim();
        if (userName.equals("")) {
            Toast.makeText(getActivity(), "用户名不能为空!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (valicationCode.equals("")) {
            Toast.makeText(getActivity(), "验证码不能为空!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(!serverValicationCode.equals(valicationCode))
        {
            Toast.makeText(getActivity(), "验证码错误", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (passWord1.equals("")) {
            Toast.makeText(getActivity(), "密码不能为空!", Toast.LENGTH_SHORT).show();
            return false;
        } else if (passWord1.length() < 6) {
            Toast.makeText(getActivity(), "密码至少6位!", Toast.LENGTH_SHORT).show();
            return false;
        }else if (passWord1 != passWord2){
            Toast.makeText(getActivity(), "两次密码不相同", Toast.LENGTH_SHORT).show();
            return false;
        }
        registerParams.put("username", userName);
        registerParams.put("psd1", passWord1);
        registerParams.put("psd2", passWord2);
        return true;
    }*/

}



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

