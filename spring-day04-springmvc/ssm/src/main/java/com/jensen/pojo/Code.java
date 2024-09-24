package com.jensen.pojo;

import org.springframework.stereotype.Repository;

// 状态码

public interface Code {
    // 正常状态码
    Integer SAVE_OK = 20011;
    Integer DELETE_OK = 20021;
    Integer UPDATE_OK = 20031;
    Integer GET_OK = 20041;

    // 错误状态码
    Integer SAVE_ERR = 20010;
    Integer DELETE_ERR = 20020;
    Integer UPDATE_ERR = 20030;
    Integer GET_ERR = 20040;

    // 异常状态码
    Integer SYSTEM_ERR = 50001;
    Integer SYSTEM_TIMEOUT_ERR = 50002;
    Integer SYSTEM_UNKNOWN_ERR = 59999;
    Integer BUSINESS_ERR = 60002;
}
