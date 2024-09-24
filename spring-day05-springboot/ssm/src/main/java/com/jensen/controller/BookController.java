package com.jensen.controller;

import com.jensen.po.Book;
import com.jensen.service.BookService;
import com.jensen.vo.Code;
import com.jensen.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName BookController
 * @Description Book控制器
 * @Author gyl
 * @Date 22 10:42
 * @Version 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    //插入操作
    @PostMapping
    public Result save(@RequestBody Book book) {
        Boolean result = bookService.save(book);
        Integer code = result ? Code.SAVE_OK : Code.SAVE_ERR;
        String msg = result ? "插入成功" : "插入失败";
        return new Result(code, msg, result);
    }

    //查询全部
    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String msg = bookList != null ? "查找成功" : "查找失败";

        System.out.println("getAll 执行");
        return new Result(code, msg, bookList);
    }

    //根据ID查询
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String msg = book != null ? "查找成功" : "查找失败";
        return new Result(code, msg, book);
    }
}
