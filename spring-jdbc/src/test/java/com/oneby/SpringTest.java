package com.oneby;

import com.oneby.dao.BookDao;
import com.oneby.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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
                new ClassPathXmlApplicationContext("jdbc-test.xml");

        //2.获取bookDaoImpl对象
        BookDao bookDao = iocContainer.getBean(BookDao.class);

        //3.执行方法
        Book books = bookDao.findBookInfo(1);
        System.out.println(books);
    }

}

