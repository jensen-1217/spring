package com.jensen.service.impl;

import com.jensen.dao.AccountDao;
import com.jensen.service.AccountService;
import com.jensen.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    public void transfer(String out,String in ,Double money) throws FileNotFoundException {

        try{
            accountDao.outMoney(out,money);
//            int i=5/0;
        /*if(true){
            throw new FileNotFoundException("文件没有找到");
        }*/
            accountDao.inMoney(in,money);

        }finally {
            logService.log(out, in, money);
        }
    }

}
