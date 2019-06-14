package com.opay.utils.result;


import java.util.ArrayList;
import java.util.List;

public enum ResultCode {


    /* 成功状态码 */
    SUCCESS(1, "成功"),
    XGCH(1, "修改成功"),
    REGISTER(1, "注册成功"),
    UPDAT_SUCCESS(1, "修改成功"),
    SIGNIN_SUCCESS(1, "登录成功"),
    DELETE_SUCCESS(1, "删除成功"),
    TX_SUCCESS(1, "提现申请提交成功"),
    RZ_SUCCESS(1, "认证成功"),
    FAIL(0, "失败"),
    QUERY_FAIL_1(0, "查询失败 error -1"),

    WZC_ERROR(4000, "请先注册"),
    MOBILE_EXITS(0,"手机号已被注册"),
    NAME_EXITS(0,"用户名已被注册"),
    IDCARD_EXITS(0,"身份证号已被注册"),
    PHONE_LESS(0,"手机号必须为11位"),
    PHONE_INVALID(0,"手机号格式不正确"),
    BANKCARD_INVALID(0,"请输入正确银行卡"),

    PARAM_ERR(0,"参数错误");


    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }

    // 校验重复的code值
    public static void main(String[] args) {
        ResultCode[] ApiResultCodes = ResultCode.values();
        List<Integer> codeList = new ArrayList<Integer>();
        for (ResultCode ApiResultCode : ApiResultCodes) {
            if (codeList.contains(ApiResultCode.code)) {
                System.out.println(ApiResultCode.code);
            } else {
                codeList.add(ApiResultCode.code());
            }
        }
        // System.out.println(JsonKit.toJson(codeList));
    }

}
