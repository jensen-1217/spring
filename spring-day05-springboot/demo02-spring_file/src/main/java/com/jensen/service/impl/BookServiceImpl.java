package com.jensen.service.impl;

import com.jensen.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("hello service");
    }
}
