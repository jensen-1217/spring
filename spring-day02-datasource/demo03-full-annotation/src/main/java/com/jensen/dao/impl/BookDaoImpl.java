package com.jensen.dao.impl;

import com.jensen.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component("bookDao")
@Repository
//@Scope("prototype")//多例
@Scope("singleton")//默认单例
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");
    }

    @PostConstruct
    public void init(){
        System.out.println("book Dao 初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("book Dao 销毁方法");
    }

}
