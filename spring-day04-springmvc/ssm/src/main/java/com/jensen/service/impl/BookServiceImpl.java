package com.jensen.service.impl;

import com.jensen.dao.BookDao;
import com.jensen.exception.BusinessException;
import com.jensen.exception.SystemException;
import com.jensen.pojo.Book;
import com.jensen.pojo.Code;
import com.jensen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    //注入BookDao对象
    @Autowired
    private BookDao bookDao;

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Override
    public void delete(Integer id) {
        bookDao.delete(id);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book getById(Integer id) {
        if(id<0){
            throw new BusinessException(Code.BUSINESS_ERR,"请勿进行非法操作");
        }else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("g:\\123.txt");

            }catch (FileNotFoundException e){
                throw new SystemException(Code.SYSTEM_UNKNOWN_ERR,"id写入磁盘失败");
            }
        }

        return bookDao.getById(id);
    }
}
