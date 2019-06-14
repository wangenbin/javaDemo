package com.opay.utils.result;

import java.io.Serializable;
import java.util.Date;

public class Result implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1310065887710454332L;

    private Integer code;

    private String errorMsg;

    private Object value;

    private Date currentDate;

    //private long tag;

    // web端分页的总页数
    //private long total;

    public Result() {
    }

    public Result(Integer code, String errorMsg, Date currentDate, long tag) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.currentDate = currentDate;
        //this.tag = tag;
    }

    /***
     * @User：Wind
     * @Date： 2018-02-01 12:05
     * @Params： [success, errorMsg, value]
     * @Return：com.xqx.merchant_app.utils.ResultTool
     * @Content： 自定义返回结果
     */
    public static Result getResult(Integer code, String errorMsg, Object value) {
        Result result = new Result();
        result.setCode(code);
        result.setErrorMsg(errorMsg);
        result.setValue(value);
        result.setCurrentDate(new Date());
        //result.setTag(System.currentTimeMillis());
        return result;

    }

    /***
     * @User：Wind
     * @Date： 2018-02-01 12:14
     * @Params： []
     * @Return：com.xqx.merchant_app.utils.ResultTool
     * @Content： 直接返回成功信息
     */
    public static Result success() {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    /***
     * @User：Wind
     * @Date： 2018-02-01 12:14
     * @Params： [value]
     * @Return：com.xqx.merchant_app.utils.ResultTool
     * @Content： 返回成功 携带数据的结果
     */
    public static Result success(Object value) {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setValue(value);
        return result;
    }

    public static Result success(ResultCode resultCode) {
        Result result = new Result();
        result.setResultCode(resultCode);
        //result.setValue(value);
        //result.setTotal(total);
        return result;
    }


    public static Result success(Object value, long total) {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setValue(value);
        //result.setTotal(total);
        return result;
    }

    /***
     * @User：Wind
     * @Date： 2018-02-01 12:14
     * @Params： [resultCode]
     * @Return：com.xqx.merchant_app.utils.ResultTool
     * @Content： 直接返回失败结果
     */
    public static Result failure(ResultCode resultCode) {
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    /***
     * @User：Wind
     * @Date： 2018-02-01 12:15
     * @Params： [resultCode, value]
     * @Return：com.xqx.merchant_app.utils.ResultTool
     * @Content： 返回携带数据的 失败结果
     */
    public static Result failure(ResultCode resultCode, Object value) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setValue(value);
        return result;
    }

    /***
     * @User：Wind
     * @Date： 2018-02-27 14:35
     * @Params： [resultCode, value]
     * @Return：com.ccpp.utils.Result
     * @Content： 返回自定义信息的失败结果
     */
    public static Result failure(ResultCode resultCode, String errorMsg) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setErrorMsg(errorMsg);
        return result;
    }

    /***
     * @User：Wind
     * @Date： 2018-02-01 12:16
     * @Params： [resultCode]
     * @Return：void
     * @Content： 通过枚举赋值 ResultTool 相关字段值
     */
    public void setResultCode(ResultCode resultCode) {
        this.code = resultCode.code();
        this.errorMsg = resultCode.message();
        this.currentDate = new Date();
        //this.tag = System.currentTimeMillis();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

   /* public long getTag() {
        return tag;
    }

    public void setTag(long tag) {
        this.tag = tag;
    }*/

   /* public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }*/
}
