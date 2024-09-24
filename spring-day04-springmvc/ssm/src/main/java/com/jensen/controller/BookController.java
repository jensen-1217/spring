package com.jensen.controller;

import com.jensen.pojo.Book;

import com.jensen.pojo.Code;
import com.jensen.pojo.Result;
import com.jensen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
//@RequestMapping("books") //在springmvc中的路径映射里面第一个“/”可以省略
@RequestMapping("/books")
public class BookController {

    //注入业务对象
    @Autowired
    private BookService bookService;

    //新增, 通过请求体传递新增的数据
    //@RequestBody 获取请求体数据转换为java对象
    @PostMapping
    public Result save(@RequestBody Book book){

        bookService.save(book);
        return Result.success(Code.SAVE_OK,true);
    }

    //查询所有书
    @GetMapping
    public Result getAll(){
        int i=8/0;
        List<Book> all = bookService.getAll();
        return Result.success(Code.GET_OK,all);
    }


    //删除
    @DeleteMapping("/{id}")
   public Result delete(@PathVariable Integer id){
        bookService.delete(id);
        return Result.success(Code.DELETE_OK,true);
   }

    //修改
    @PutMapping
   public Result update(@RequestBody Book book){
        bookService.update(book);
        return Result.success(Code.UPDATE_OK,true);
    }


    @GetMapping("/{id}")
   public Result getById(@PathVariable Integer id){
       Book book = bookService.getById(id);
       return Result.success(Code.GET_OK,book);
    }


}
