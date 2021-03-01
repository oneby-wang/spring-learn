package com.oneby.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName SpringAopConfig
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/23 19:00
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.oneby")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringAopConfig {

}
