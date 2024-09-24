package com.jensen.service.impl;

import com.jensen.dao.BookDao;
import com.jensen.dao.impl.BookDaoImpl;
import com.jensen.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();

    @Override
    public void save() {
        System.out.println("bookService 保存数据");
        bookDao.save();
    }
}
