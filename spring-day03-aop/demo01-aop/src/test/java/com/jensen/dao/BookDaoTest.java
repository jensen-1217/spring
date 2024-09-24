package com.jensen.dao;


import com.jensen.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookDaoTest {
    //注入BookDao
    @Autowired
    private BookDao bookDao;

    @Test
    public void Test7(){
        bookDao.openUrl("http://pan.baidu.com/DHSKsjj4554","jensen   ");
    }

    @Test
    public void test(){

        //运行方法
//        bookDao.save();
//        bookDao.update();
//        bookDao.delete();

//        bookDao.method(2);
        bookDao.method3(2);
    }
}
