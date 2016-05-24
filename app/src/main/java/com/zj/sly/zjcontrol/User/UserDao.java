package com.zj.sly.zjcontrol.User;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by asus on 2016/5/10.
 */
public class UserDao {
    //获取验证码
    /*public static String getValidateCode(AppContext appContext,
                                         Map<String, Object> map) throws AppException {
        // 定义要访问的接口和要强转的实体
        String validateUrl = _MakeURL(URLs.VALIDATE_CODE_URL, map);
        ValidateCode validateCode = null;
        try {
            // 获取服务器端Json数据
            String json = http_get(appContext, validateUrl);

            // 解析为制定的实体对象
            validateCode = (ValidateCode) JSON.parseObject(json,
                    ValidateCode.class);

        } catch (Exception e) {
            if (e instanceof AppException)
                throw (AppException) e;
            throw AppException.network(e);
        }

        // 返回验证码
        return validateCode.getCode();
    }

    //获取服务器验证(不需要缓存)
    public String getCode(Map<String, Object> map) throws AppException {

        String validateCode = "";

        // 如果网络可连接且解析无误返回正确的验证码，否则返回空字符串
        if (isNetworkConnected()) {
            try {
                validateCode = ApiClient.getValidateCode(this, map);
            } catch (AppException e) {
                if (validateCode == "") {
                    throw e;
                }
            }
        }
        return validateCode;
    }

   /* 说明：移动：134、135、136、137、138、139、150、151、157(TD)、158、159、187、188
    * 联通：130、131、132、152、155、156、185、186
    * 电信：133、153、180、189
    * 总结起来就是第一位必定为1，第二位必定为3或5或8，其他位置的可以为0-9
    * 验证号码 手机号 固话均可*/
   public static boolean isPhoneNumberValid(String phoneNumber) {
       boolean isValid = false;
       String expression = "((^(13|15|18)[0-9]{9}$)|(^0[1,2]{1}\\d{1}-?\\d{8}$)|(^0[3-9] {1}\\d{2}-?\\d{7,8}$)|(^0[1,2]{1}\\d{1}-?\\d{8}-(\\d{1,4})$)|(^0[3-9]{1}\\d{2}-? \\d{7,8}-(\\d{1,4})$))";
       CharSequence inputStr = phoneNumber;
       Pattern pattern = Pattern.compile(expression);
       Matcher matcher = pattern.matcher(inputStr);
       if (matcher.matches() ) {
           isValid = true;
       }
       return isValid;
   }

}
