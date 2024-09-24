package com.jensen.advice;


import com.jensen.exception.BusinessException;
import com.jensen.exception.SystemException;
import com.jensen.pojo.Code;
import com.jensen.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler
    public Result doException(Exception ex){
        return Result.error(Code.SYSTEM_UNKNOWN_ERR,null,"系统繁忙，请稍后重试");
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        return Result.error(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return Result.error(ex.getCode(),null,ex.getMessage());
    }
}
