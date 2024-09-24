package com.jensen.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component //放在普通类上，将这个类放入IOC容器
@Aspect //定义这个类是切面类
public class MyAdvice {

    private long begin;
    private long end;

    //定义切入点
//    @Pointcut("execution(* com.jensen.dao.BookDao.*(..))")
    @Pointcut("execution(* com.jensen.dao.BookDao.update(..))")
    private void pt(){
        System.out.println("111");
    }

    //通知方法
    @Before("pt()")
    public void testAdvice(){
        begin = System.currentTimeMillis();
        System.out.println("begin="+begin);
    }

    @AfterThrowing("pt()")
    public void test2Advice(){
        end = System.currentTimeMillis();
        System.out.println("end="+end);
        System.out.println("运行时间="+(end-begin)+"s");

    }


    @Around("execution(* com.jensen.dao.BookDao.delete(..))")
    public Object update1(ProceedingJoinPoint point){


        Object pr = null;
        try {
            System.out.println("around前置");
            pr = point.proceed();
            System.out.println("around后置");
        } catch (Throwable throwable) {
            System.out.println("around异常");
            throwable.printStackTrace();
        }finally {
            System.out.println("around最终");
        }

        return pr;

    }

    @Around("execution(* com.jensen.dao.BookDao.method(..))")
    public Object methodAround(ProceedingJoinPoint pjp){

        Object[] args = pjp.getArgs();
        System.out.println("Arrays.toString(args)"+Arrays.toString(args));
        Signature signature = pjp.getSignature();
        System.out.println(signature);
        String name = signature.getName();
        System.out.println(name);
        Class declaringType = signature.getDeclaringType();
        System.out.println(declaringType);
        String declaringTypeName = signature.getDeclaringTypeName();
        System.out.println(declaringTypeName);


        Object pr = null;
        try {
            begin = System.currentTimeMillis();
            System.out.println("开始时间="+begin+"ms");
            for (int i = 0; i < 10000; i++) {
                pr = pjp.proceed();
            }
            end = System.currentTimeMillis();
            System.out.println("结束时间="+end+"ms");
        } catch (Throwable throwable) {
            System.out.println("around异常");
            throwable.printStackTrace();
        }finally {
            long time = end - begin;
            System.out.println("运行时间="+time+"ms");
        }

        return pr;

    }

    @AfterReturning(value = "execution(* com.jensen.dao.BookDao.method3(..))",returning = "ret")
    public void afterReturning(JoinPoint jp,Object ret){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println(ret);
    }


    @AfterThrowing(value = "execution(* com.jensen.dao.BookDao.method3(..))",throwing = "t")
    public void afterThroeing(JoinPoint jp,Throwable t){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println(t);
    }

    @Around("execution(* com.jensen.dao.BookDao.openUrl(..))")
    public Object openUrlAround(ProceedingJoinPoint pjp){

        Object pr = null;
        try {
            Object[] args = pjp.getArgs();
            System.out.println(Arrays.toString(args));
            for (int i = 0; i < args.length; i++) {
                if(args[0].getClass().equals(String.class)){
                    args[i] = args[i].toString().trim();
                }
                System.out.println(args[i]);
            }

            pr = pjp.proceed(args);

        } catch (Throwable throwable) {

            throwable.printStackTrace();
        }finally {

        }

        return pr;
    }


}
