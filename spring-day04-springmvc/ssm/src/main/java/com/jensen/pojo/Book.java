package com.jensen.pojo;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/


import org.springframework.stereotype.Repository;

//@Data //lombok的注解，可以给实体类生成set\get和重写toString()方法
//@AllArgsConstructor //2.生成全参构造函数
//@NoArgsConstructor //3.生成无参构造函数

public class Book {

    private Integer id;
    private String type;
    private String name;
    private String description;


    public Book() {
    }

    public Book(Integer id, String type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Book{id = " + id + ", type = " + type + ", name = " + name + ", description = " + description + "}";
    }
}
