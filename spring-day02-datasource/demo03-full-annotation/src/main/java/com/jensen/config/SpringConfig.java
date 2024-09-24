package com.jensen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //表示配置类 代替xml文件
@ComponentScan("com.jensen") //表示扫描包
@PropertySource("classpath:jdbc-8.properties") //读取配置文件
public class SpringConfig {

}
