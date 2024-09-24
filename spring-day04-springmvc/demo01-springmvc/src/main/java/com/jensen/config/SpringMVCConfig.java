package com.jensen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.jensen")
@EnableWebMvc
public class SpringMVCConfig implements WebMvcConfigurer {


    //创建一个视图解析器到ICO容器中
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");

        return resolver;
    }



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/");
        /*registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");*/
    }
}
