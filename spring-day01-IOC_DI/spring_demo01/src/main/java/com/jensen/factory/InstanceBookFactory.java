package com.jensen.factory;

import com.jensen.dao.BookDao;
import com.jensen.dao.impl.BookDaoImpl;

public class InstanceBookFactory {
    public BookDao getBookDao(){
        System.out.println("InstanceBookFactory dao");
        return new BookDaoImpl();
    }
}
