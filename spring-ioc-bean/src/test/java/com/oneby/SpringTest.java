package com.oneby;


import com.oneby.config.SpringConfig;
import com.oneby.entity.CollectionExample;
import com.oneby.entity.CorporateSlave;
import com.oneby.entity.Order;
import com.oneby.entity.Student;
import com.oneby.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;

/**
 * @ClassName SpringTest
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/13 20:50
 * @Version 1.0
 */
public class SpringTest {

    @Test
    public void test() {
        //1.创建IOC容器对象
        ApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("annotation-config.xml");

        //2.根据id值获取bean实例对象
        OrderService orderService = (OrderService) iocContainer.getBean("orderService");

        //3.调用bean中的方法
        orderService.sell();
    }

    @Test
    public void testCompleteAnnotation() {
        //1.创建IOC容器对象
        ApplicationContext iocContainer =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        //2.根据id值获取bean实例对象
        OrderService orderService = (OrderService) iocContainer.getBean("orderService");

        //3.调用bean中的方法
        orderService.sell();
    }

}

