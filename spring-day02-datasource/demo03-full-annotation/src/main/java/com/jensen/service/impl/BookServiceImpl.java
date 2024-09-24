package com.jensen.service.impl;

import com.jensen.dao.BookDao;
import com.jensen.dao.impl.BookDaoImpl;
import com.jensen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

//    private BookDao bookDao = new BookDaoImpl();

    @Autowired
    @Qualifier("bookDao2Impl") //不能单独使用，要和@Autowired一起使用
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("bookService 保存数据");
        bookDao.save();
    }
}
