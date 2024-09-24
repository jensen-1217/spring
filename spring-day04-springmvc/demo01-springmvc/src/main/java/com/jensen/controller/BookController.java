package com.jensen.controller;

import com.jensen.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {

//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseBody
    @PostMapping
    public String save(@RequestBody Book book){

        System.out.println(book);
        return "{'module':'save'}";
    }

//    @RequestMapping(method = RequestMethod.PUT)
//    @ResponseBody
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println(book);
        return "{'module':'update'}";
    }

//    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
//    @ResponseBody
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        System.out.println("delete id="+id);
        return "{'module':'delete'}";
    }

//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping("/{id}")
    public String getById(@PathVariable int id){
        System.out.println("getById id="+id);
        return "{'module':'getById'}";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping
    public List<Book> getAll(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book(1, "计算机", "SpringMVC入门教程", "SpringMVC");
        Book book2 = new Book(2, "计算机", "SpringMVC精通教程", "SpringMVC");
        Book book3 = new Book(3, "计算机", "SpringMVC实战教程", "SpringMVC");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        return books;
    }


}
