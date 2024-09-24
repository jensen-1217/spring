package com.jensen.exception;

public class BusinessException extends RuntimeException{


    private Integer code;

    public BusinessException(Integer code, String msg) {
        super(msg);
        this.code=code;
    }

    public BusinessException(Integer code, String msg, Throwable throwable) {
        super(msg,throwable);
        this.code = code;
    }

    /**
     * 获取
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }
@Override
    public String toString() {
        return "SystemException{code = " + code + "}";
    }
}
