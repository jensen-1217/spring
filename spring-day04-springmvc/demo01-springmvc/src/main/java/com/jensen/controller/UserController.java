package com.jensen.controller;

import com.jensen.pojo.Address;
import com.jensen.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.nio.cs.US_ASCII;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    public String save(){
        return "success";
    }

//    @RequestMapping(value = "/save2",produces = "text/html;charset=utf-8")
    @RequestMapping(value = "/save2")
    @ResponseBody
    public String save2(){
        return "我是白岩的爸爸";
    }

    @RequestMapping(value = "/commonParam",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String commonParam(String name,Integer age){

        System.out.println("name = " + name + ", age = " + age);
        return "success";
    }

    @RequestMapping(value = "/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName, Integer age){

        System.out.println("name = " + userName + ", age = " + age);
        return "success";
    }

    @RequestMapping(value = "/pojoParam")
    @ResponseBody
    public String pojoParam(User user){

        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){

        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/arrayParam")
    @ResponseBody
    public String arrayParam(String[] hobby){

        System.out.println(Arrays.toString(hobby));
        return "success";
    }

    @RequestMapping(value = "/listParam")
    @ResponseBody
    public String listParam(@RequestParam  List<String> hobby){

        System.out.println(hobby);
        return "success";
    }

    @RequestMapping(value = "/jsonArray")
    @ResponseBody
    public String jsonArray(@RequestBody String[] hobby){

        System.out.println(Arrays.toString(hobby));
        return "success";
    }

    @RequestMapping(value = "/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> hobby){

        System.out.println(hobby);
        return "success";
    }

    @RequestMapping(value = "/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){

        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> users){


        System.out.println(users);
        return "success";
    }

    @RequestMapping(value = "/dateParam")
    @ResponseBody
    public String dateParam(Date date,@DateTimeFormat(pattern = "yyyy-MM-dd") Date date1){

        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println("timestamp = " + timestamp);

        System.out.println("date = " + date + ", date1 = " + date1);
        return "success";
    }

    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        User user = new User();
        user.setName("白岩");
        user.setAge(23);
        user.setAddress(new Address("山西","忻州"));
        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){

        ArrayList<User> users = new ArrayList<>();

        User user = new User();
        User user1 = new User();
        User user2 = new User();
        user.setName("白岩");
        user.setAge(23);
        user1.setName("白岩");
        user1.setAge(23);
        user2.setName("白岩");
        user2.setAge(23);
        users.add(user);
        users.add(user1);
        users.add(user2);

        return users;
    }

}
