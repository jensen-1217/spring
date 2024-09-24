package com.jensen.service.impl;

import com.jensen.dao.AccountDao;
import com.jensen.pojo.Account;
import com.jensen.service.AccountService;
import com.jensen.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {

//        SqlSession sqlSession = MyBatisUtils.openSession();
//        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<Account> all = mapper.findAll();
        List<Account> all = accountDao.findAll();
        return  all;
    }
}










