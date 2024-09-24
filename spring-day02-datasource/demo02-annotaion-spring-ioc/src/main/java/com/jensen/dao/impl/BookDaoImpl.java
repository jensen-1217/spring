package com.jensen.dao.impl;

import com.jensen.dao.BookDao;
import org.springframework.stereotype.Component;


@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");
    }
}
