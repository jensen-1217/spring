package com.jensen.config;


import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;


import javax.sql.DataSource;


public class MybatisConfig {

//配置sqlSession工厂
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        Configuration configuration = new Configuration();
        configuration.setLogImpl(StdOutImpl.class);
        configuration.setMapUnderscoreToCamelCase(true);
        ssfb.setConfiguration(configuration);
        ssfb.setTypeAliasesPackage("com.jensen.pojo");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    //扫包mapper包，帮助我们扫描包让其加入到IOC中
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.jensen.dao");
        return msc;
    }

}
