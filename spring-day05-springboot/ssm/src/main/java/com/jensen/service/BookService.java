package com.jensen.service;

import com.jensen.po.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author gyl
 * @Date 22 10:22
 * @Version 1.0
 */
@Transactional
public interface BookService {

    //插入操作
    Boolean save(Book book);

    //查询全部
    List<Book> getAll();

    //根据ID查询
    Book getById(Integer id);
}
