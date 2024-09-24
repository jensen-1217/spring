package com.jensen.dao;

import com.jensen.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    //增
    @Insert("insert into tbl_book values (null,#{type},#{name},#{description})")
    void save(Book book);

    //删
    @Delete("delete from tbl_book where id=#{id}")
    void delete(Integer id);

    //改
    @Update("UPDATE tbl_book SET name=#{name},type=#{type},description=#{description} WHERE id=#{id}")
    void update(Book book);

    //查
    @Select("select * from tbl_book")
    List<Book> getAll();

    @Select("select * from tbl_book where id=#{id}")
    Book getById(Integer id);
}
