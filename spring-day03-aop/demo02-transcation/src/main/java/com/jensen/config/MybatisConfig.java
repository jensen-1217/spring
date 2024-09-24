package com.jensen.config;

import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class MybatisConfig {

    @Bean  //不仅可以将返回值加入IOC容器，而且可以实现方法参数进行依赖注入，参数默认会根据类型从IOC容器中获取对象自动注入
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.jensen.domain"); //告诉mybatis，设置实体类包别名
        ssfb.setDataSource(dataSource); //将IOC容器中连接池给到Mybatis

        //注意：必须导入org.apache.ibatis.session.Configuration;
        Configuration configuration = new Configuration();
        //设置整合mybatis驼峰命名映射
        configuration.setMapUnderscoreToCamelCase(true);
        //设置打印日志
        configuration.setLogImpl(StdOutImpl.class);

        ssfb.setConfiguration(configuration);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.jensen.dao"); //告诉mybatis扫描指定的接口映射包
        return mapperScannerConfigurer;
    }
}
