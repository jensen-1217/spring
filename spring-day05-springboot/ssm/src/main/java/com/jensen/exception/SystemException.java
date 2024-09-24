package com.jensen.exception;

/**
 * @ClassName BusinessException
 * @Description 业务异常
 * @Author gyl
 * @Date 22 11:43
 * @Version 1.0
 */
public class SystemException extends RuntimeException{
    private Integer code;

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
