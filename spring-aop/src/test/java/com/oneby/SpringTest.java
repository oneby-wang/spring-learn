package com.oneby;


import com.oneby.calc.ArithmeticCalculator;
import com.oneby.calc.ArithmeticCalculatorImpl;
import com.oneby.config.SpringAopConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

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
        ConfigurableApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("aop-test.xml");

        //2.根据id值获取bean实例对象
        ArithmeticCalculator arithmeticCalculator = iocContainer.getBean(ArithmeticCalculator.class);

        //3.调用bean中的方法
        System.out.println("spring版本：" + SpringVersion.getVersion() + "下的测试");
        arithmeticCalculator.div(1, 0);
    }

    @Test
    public void testAnnotation() {
        //1.创建IOC容器对象
        ApplicationContext iocContainer =
                new AnnotationConfigApplicationContext(SpringAopConfig.class);

        //2.根据id值获取bean实例对象
        ArithmeticCalculator arithmeticCalculator = iocContainer.getBean(ArithmeticCalculator.class);

        //3.调用bean中的方法
        System.out.println("spring版本：" + SpringVersion.getVersion() + "下的测试");
        arithmeticCalculator.div(1, 0);
    }

    @Test
    public void testXml() {
        //1.创建IOC容器对象
        ConfigurableApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("aop-complete-xml.xml");

        //2.根据id值获取bean实例对象
        ArithmeticCalculator arithmeticCalculator = iocContainer.getBean(ArithmeticCalculator.class);

        //3.调用bean中的方法
        System.out.println("spring版本：" + SpringVersion.getVersion() + "下的测试");
        arithmeticCalculator.div(1, 0);
    }

}

