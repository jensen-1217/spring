package com.jensen.dao;

import com.jensen.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao {

    @Select("select * from tbl_book")
    List<Book> getAll();
}
