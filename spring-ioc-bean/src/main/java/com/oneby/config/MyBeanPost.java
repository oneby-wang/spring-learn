package com.oneby.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName MyBeanPost
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/21 21:59
 * @Version 1.0
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第三步：执行 postProcessBeforeInitialization 方法");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：执行 postProcessAfterInitialization 方法");
        return bean;
    }
}
