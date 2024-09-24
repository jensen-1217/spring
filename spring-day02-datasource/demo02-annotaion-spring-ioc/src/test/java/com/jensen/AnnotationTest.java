package com.jensen;

import com.jensen.dao.BookDao;
import com.jensen.dao.impl.BookDaoImpl;
import com.jensen.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

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
