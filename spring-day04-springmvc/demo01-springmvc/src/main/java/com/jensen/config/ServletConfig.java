package com.jensen.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletConfig extends AbstractDispatcherServletInitializer {
    //加载springmvc的配置 放到IOC
    @Override
    protected WebApplicationContext createServletApplicationContext() {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);

        return ctx;
    }

    //设置tomcat接收到哪些请求交给我们的springmvc '/'表是所有的请求都会被springmvc处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //加载spring配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    @Override
    protected Filter[] getServletFilters() {

        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");

        return new Filter[]{encodingFilter};
    }
}
