package com.jensen.service;

import com.jensen.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface BookService {

    //新增
    void save(Book book);

    //删除
    void delete(Integer id);

    //修改
    void update(Book book);

    //查询所有书
    List<Book> getAll();

    Book getById(Integer id);
}
