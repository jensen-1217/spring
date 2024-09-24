package com.jensen;


import com.jensen.config.SpringMVCConfig;
import com.jensen.dao.BookDao;
import com.jensen.pojo.Book;
import com.jensen.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringMVCConfig.class)
@WebAppConfiguration
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;
    @Autowired
    private BookService bookService;


    @Test
    public void test2(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void test(){

        List<Book> all = bookDao.getAll();
        System.out.println("all = " + all);

    }
}
