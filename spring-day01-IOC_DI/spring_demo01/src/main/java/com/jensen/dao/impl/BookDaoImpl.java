package com.jensen.dao.impl;

import com.jensen.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookDaoImpl implements BookDao, InitializingBean, DisposableBean {
    public BookDaoImpl() {
//        System.out.println("bookDaoImpl");
    }

    public void save() {
        System.out.println("bookDao save");
    }

    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

//    public void init(){
//        System.out.println("init");
//    }
//
//    public void destroy(){
//        System.out.println("destroy");
//    }
}
