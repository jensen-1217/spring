package com.jensen.service.impl;

import com.jensen.dao.BookDao;
import com.jensen.dao.impl.BookDaoImpl;
import com.jensen.service.BookService;

public class BookServiceImpl implements BookService {
    BookDao bookDao1;
//    Integer number;

//    public BookServiceImpl(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

//    public BookServiceImpl(BookDao bookDao, Integer number) {
//        this.bookDao = bookDao;
//        this.number = number;
//    }


    public void setBookDao1(BookDao bookDao) {
        this.bookDao1 = bookDao;
    }
//
//    public void setNumber(Integer number) {
//        this.number = number;
//    }

    public void save() {
        bookDao1.save();
//        System.out.println("number"+number);
        System.out.println("Book Service save");
    }
}
