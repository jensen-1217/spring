package com.jensen;

import com.jensen.dao.BookDao;
import com.jensen.service.BookService;
import com.jensen.service.ResourceService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //初始化容器
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("springContext.xml");

//        ResourceService resourceService = (ResourceService) ctx.getBean("resourceService");
//        System.out.println(resourceService);

//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();

        //优雅关闭，注册关闭狗子，在虚拟机退出前先关闭容器再退出虚拟机
        ctx.registerShutdownHook();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        //暴力关闭，手动关闭
//        ctx.close();

//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();

//        BookDao dao = (BookDao) ctx.getBean("dao2");
//        BookDao dao1 = (BookDao) ctx.getBean("dao2");
//        System.out.println(dao);
//        System.out.println(dao1);
//        dao.save();
    }
}
