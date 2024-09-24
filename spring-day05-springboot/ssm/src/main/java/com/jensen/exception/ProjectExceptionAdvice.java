package com.jensen.exception;

import com.jensen.vo.Code;
import com.jensen.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName ProjectExceptionAdvice
 * @Description 全局异常处理
 * @Author gyl
 * @Date 22 11:34
 * @Version 1.0
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        //导出项目日志
        //发邮件给运维人员
        //发消息给开发人员
        return new Result(e.getCode(),e.getMessage(),null);
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        //导出项目日志
        //发邮件给运维人员
        //发消息给开发人员
        //发消息给领导
        return new Result(e.getCode(),e.getMessage(),null);
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        return new Result(Code.ERROR,"项目出错了",null);
    }
}
