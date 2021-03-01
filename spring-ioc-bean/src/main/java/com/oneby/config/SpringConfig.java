package com.oneby.config;

import com.oneby.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SpringConfig
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/22 19:26
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.oneby")
public class SpringConfig {

    @Bean
    public OrderService getOrderService(){
        return new OrderService();
    }

}
