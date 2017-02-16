package com.vivebest.dubbo.datasourceconfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created by clear on 2017/2/16.
 */
public class DataSourcePool {

    private static Logger log = LoggerFactory.getLogger(DataSourcePool.class);
    @Value("${spring.datasource.driver-class-name}")
    private String driver;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.max-active}")
    private int maxActive;
    @Value("${spring.datasource.dbcp.initial-size}")
    private int initSize;

    @Bean(name="dataSource",destroyMethod="close",initMethod = "init")
    public DataSource initDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(initSize);
        dataSource.setMaxActive(maxActive);
        log.debug("init dataSource");
        return dataSource;
    }
}
