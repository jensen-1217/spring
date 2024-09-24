package com.jensen.config;

import com.jensen.handler.ProjectHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@ComponentScan("com.jensen")
@EnableWebMvc
public class SpringMVCConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectHandler projectHandler;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new ProjectHandler()).addPathPatterns("/books/**");
        registry.addInterceptor(projectHandler).addPathPatterns("/books/**");
    }
}
