package com.example.demo.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * Created by zyz on 2018/3/6.
 */
@Configuration
@MapperScan("com.example.demo.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcurl;
    @Value("${jdbc.username}")
    private String jdbcusername;
    @Value("${jdbc.pass}")
    private String jdbcPassword;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcurl);
        dataSource.setUser(jdbcusername);
        dataSource.setPassword(jdbcPassword);
        //关闭连接后不自动提交sql
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
