package com.jensen.dao;

import com.jensen.po.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.omg.PortableInterceptor.INACTIVE;


import java.util.List;

/**
 * @ClassName BookDao
 * @Description TODO
 * @Author gyl
 * @Date 22 10:09
 * @Version 1.0
 */
@Mapper
public interface BookDao {
    //插入操作
    @Insert("insert into tbl_book (type,name,description) values(#{type},#{name},#{description})")
    Integer save(Book book);

    //查询全部
    @Select("select * from tbl_book")
    List<Book> getAll();

    //根据ID查询
    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}
