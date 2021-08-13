package com.miaoshaproject.error;

/**
 * @author hongjun500
 * @date 2019/2/1 10:42
 */
public enum EmBusinessError implements CommonError {
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FAIL(20002,"用户手机号或者密码不正确"),
    USER_NOT_LOGIN_(20003,"用户还未登录"),
    //30000开头为交易信息相关错误定义
    STOCK_NOT_ENOUGH(30001,"库存不足"),
    ;

    /**
     * @param errCode
     * @param errMsg
     */
     private EmBusinessError(int errCode,String errMsg){
        this.errCode=errCode;
        this.errMsg=errMsg;
    }

    private int errCode;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg=errMsg;
        return this;
    }}
