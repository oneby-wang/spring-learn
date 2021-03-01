package com.oneby.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @ClassName TransactionConfig
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/24 22:39
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.oneby")
@EnableTransactionManagement
@PropertySource(value = "classpath:jdbc.properties")
public class TransactionConfig {

    @Value("${prop.userName}")
    private String userName;

    @Value("${prop.password}")
    private String password;

    @Value("${prop.url}")
    private String url;

    @Value("${prop.driverClass}")
    private String driverClass;

    // 数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClass);
        return dataSource;
    }

    // 创建 JdbcTemplate 对象
    // DataSource：IOC 容器会自动为我们注入类型为 DataSource 的 bean
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    // 创建事务管理器
    // DataSource：IOC 容器会自动为我们注入类型为 DataSource 的 bean
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}

