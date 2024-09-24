package com.jensen.service.impl;

import com.jensen.dao.LogDao;
import com.jensen.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    public void log(String out,String in,Double money ) {
        logDao.log("转账操作由"+out+"到"+in+",金额："+money);
    }
}