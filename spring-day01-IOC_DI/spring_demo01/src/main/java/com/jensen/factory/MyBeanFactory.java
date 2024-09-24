package com.jensen.factory;

import com.jensen.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory implements FactoryBean {
    public Object getObject() throws Exception {
        System.out.println("MyBeanFactory bookDao");
        return new BookDaoImpl();
    }

    public Class<?> getObjectType() {
        return null;
    }
}
