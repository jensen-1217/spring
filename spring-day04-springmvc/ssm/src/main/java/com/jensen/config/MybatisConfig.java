package com.jensen.config;

import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        ssfb.setDataSource(dataSource);//数据源
        ssfb.setTypeAliasesPackage("com.jensen.pojo");//数据查询结果封装到哪里

        Configuration configuration = new Configuration();
        configuration.setLogImpl(StdOutImpl.class);//在控制台打印sql语句
        configuration.setMapUnderscoreToCamelCase(true);//开启驼峰命名
        ssfb.setConfiguration(configuration);

        return ssfb;

    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.jensen.dao");
        return mapperScannerConfigurer;
    }
}
