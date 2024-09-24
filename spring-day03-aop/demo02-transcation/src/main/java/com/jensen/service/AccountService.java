package com.jensen.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.IOException;

//@Transactional(rollbackFor = FileNotFoundException.class)
@Transactional
public interface AccountService {

    public void transfer(String out,String in ,Double money) throws IOException;
}
