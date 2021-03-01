package com.oneby;


import com.oneby.config.TransactionConfig;
import com.oneby.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName com.com.oneby.SpringTest
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
                new ClassPathXmlApplicationContext("xml-transaction-config.xml");

        //2.获取AccountService对象
        AccountService accountService = iocContainer.getBean(AccountService.class);

        //3.执行数据库操作
        accountService.transfer("Heygo", "Oneby", 100);
    }

    @Test
    public void testAnnotation() {
        //1.创建IOC容器对象
        ApplicationContext iocContainer =
                new AnnotationConfigApplicationContext(TransactionConfig.class);

        //2.获取AccountService对象
        AccountService accountService = iocContainer.getBean(AccountService.class);

        //3.执行数据库操作
        accountService.transfer("Heygo", "Oneby", 100);
    }

}

