package com.jensen.service;

import com.jensen.dao.BookDao;
import com.jensen.exception.BusinessException;
import com.jensen.po.Book;
import com.jensen.vo.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description Book业务层实现类
 * @Author gyl
 * @Date 22 10:22
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public Boolean save(Book book) {
        Integer save = bookDao.save(book);

        return save > 0;
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }
}
