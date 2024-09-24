package com.jensen;

import com.jensen.config.SpringConfig;
import com.jensen.pojo.Account;
import com.jensen.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //junit4的写法
@ContextConfiguration(classes = SpringConfig.class) //读取配置文件
//@ContextConfiguration("classpath:applicationContext.xml")  //读取xml配置文件
public class AppTest {

    @Autowired //自动注入业务对象
    private AccountService accountService;

    @Test
    public void test(){
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
