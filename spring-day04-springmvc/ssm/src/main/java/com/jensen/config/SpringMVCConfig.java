package com.jensen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.jensen")
@PropertySource("classpath:jdbc-8.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement //开启事务
@EnableWebMvc
public class SpringMVCConfig implements WebMvcConfigurer {
}
