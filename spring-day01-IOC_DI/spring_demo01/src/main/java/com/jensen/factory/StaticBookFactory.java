package com.jensen.factory;

import com.jensen.dao.BookDao;
import com.jensen.dao.impl.BookDaoImpl;

public class StaticBookFactory {
    public static BookDao getBookDao(){
        System.out.println("StaticBookFactory dao");
        return new BookDaoImpl();
    }
}
