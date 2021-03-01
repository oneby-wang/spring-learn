package com.oneby;


import com.oneby.entity.Student;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ClassName SpringTest
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/13 20:50
 * @Version 1.0
 */
/*public class SpringTest {

    @Test
    public void gettingStart() {
        //1.创建IOC容器对象
        ApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("getting-start.xml");

        //2.根据id值获取bean实例对象
        Student student = (Student) iocContainer.getBean("student");

        //3.打印bean
        System.out.println(student);
    }

}*/

@SpringJUnitConfig(locations = "classpath:getting-start.xml")
public class SpringTest {

    @Autowired
    private Student student;

    @Test
    public void gettingStart() {
        System.out.println(student);
    }


}
