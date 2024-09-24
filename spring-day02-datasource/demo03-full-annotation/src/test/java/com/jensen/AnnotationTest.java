package com.jensen;

import com.jensen.config.SpringConfig;
import com.jensen.dao.BookDao;
import com.jensen.dao.impl.BookDaoImpl;
import com.jensen.service.BookService;
import com.jensen.util.BookUtils;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void test5(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookUtils bean = ctx.getBean(BookUtils.class);
        System.out.println(bean);
        ctx.close();
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bean = ctx.getBean(BookService.class);
        bean.save();
        ctx.close();
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //单例模式调用销毁方法，多例模式不调用
        BookDao bean = ctx.getBean(BookDao.class);
        ctx.close();
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = ctx.getBean(BookDao.class);
        BookDao bean1 = ctx.getBean(BookDao.class);
        System.out.println(bean);
        System.out.println(bean1);
        bean.save();
        ctx.close();
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = ctx.getBean(BookDao.class);
        bean.save();
        ctx.close();
    }

    @Test
    public void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

//        BookService bean = (BookService) ctx.getBean("bookServiceImpl");
//        BookService bean = ctx.getBean(BookService.class);

        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();

//        bean.save();

        ctx.close();
    }

}
