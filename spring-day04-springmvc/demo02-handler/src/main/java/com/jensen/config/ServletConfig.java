package com.jensen.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletConfig extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);
        return ctx;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }



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
