package com.example.demo.config;

import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * druid数据源配置类
 */
@Configuration
@MapperScan("com.example.demo.dao")
public class DruidDataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource druid(){
        return  new DruidDataSource();
    }

}
