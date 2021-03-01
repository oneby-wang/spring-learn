package com.oneby.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName StudentFactory
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/15 21:54
 * @Version 1.0
 */
public class StudentFactory implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        return new Student(233,"Oneby");
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
