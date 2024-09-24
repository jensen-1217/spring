package com.jensen.pojo;

//import lombok.Data;


import org.springframework.stereotype.Repository;

//@Data

public class Result<T> {

    private Integer code;
    private T data;
    private String msg;

    public Result() {
    }


    //处理返回成功结果
    public static <T> Result success(Integer code,T data){
        Result result = new Result<>();
        result.setCode(code);
        result.setData(data);
        return result;
    }

    //处理返回错误结果
    public static <T> Result error(Integer code,T data,String msg){
        Result result = new Result<>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        return result;
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

    /**
     * 获取
     * @return data
     */
    public T getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * 获取
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{code = " + code + ", data = " + data + ", msg = " + msg + "}";
    }
}
