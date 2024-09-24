package com.jensen.controller;

import com.jensen.cofig.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${enterprise.name}")
    private String name;
    @Value("${enterprise.age}")
    private Integer age;
    @Value("${enterprise.subjects[0]}")
    private List<String> subjects;

    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;

    @RequestMapping("/save")
    public String save(){
        System.out.println(name+age);
        System.out.println(subjects);
        System.out.println("我是白岩的爸爸");
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println(enterprise);
        return "hello,spring boot!";
    }

}
