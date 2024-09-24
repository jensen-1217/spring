package com.jensen.cofig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ConfigurationProperties(prefix = "enterprise")
public class Enterprise {
    private String name;
    private Integer age;
    private String[] subjects;

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }

    public Enterprise() {
    }

    public Enterprise(String name, Integer age, String[] subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
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
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return subjects
     */
    public String[] getSubjects() {
        return subjects;
    }

    /**
     * 设置
     * @param subjects
     */
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

}
