package com.jensen;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;



public class DataSourceTest {


    @Test
    public void test2() throws SQLException {
        //创建容器
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("E:/application-datasource.xml");
        //获取bean
//        DataSource druidDataSource = (DataSource)ctx.getBean("druidDataSource");
//        DataSource druidDataSource = (DataSource)ctx.getBean("druidDataSource",DataSource.class);
        DataSource druidDataSource = (DataSource)ctx.getBean(DataSource.class);


        System.out.println("druidDataSource="+druidDataSource);
        System.out.println("druidDataSource.getConnection()="+druidDataSource.getConnection());

        ctx.close();

    }

    @Test
    public void test1() throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-datasource.xml");
        DataSource druidDataSource = (DataSource)ctx.getBean("druidDataSource");

        System.out.println("druidDataSource="+druidDataSource);
        System.out.println("druidDataSource.getConnection()="+druidDataSource.getConnection());


        ctx.close();

    }
}
