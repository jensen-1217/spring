package com.jensen;

import com.jensen.config.SpringConfig;
import com.jensen.pojo.Account;
import com.jensen.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class DataSourceTest {

    @Test
    public void test3() throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService bean = ctx.getBean(AccountService.class);
        List<Account> all = bean.findAll();
        System.out.println(all);

        ctx.close();
    }

    @Test
    public void test() throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = ctx.getBean(DataSource.class);
        System.out.println(bean.getConnection());
        System.out.println(bean);
        ctx.close();
    }
}
