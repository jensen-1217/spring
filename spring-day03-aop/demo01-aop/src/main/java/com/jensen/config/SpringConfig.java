package com.jensen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("com.jensen")
@EnableAspectJAutoProxy //开启AOP
public class SpringConfig {
}
