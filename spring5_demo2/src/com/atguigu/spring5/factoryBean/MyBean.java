package com.atguigu.spring5.factoryBean;

import com.atguigu.spring5.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

    // 定义一下返回的对象类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("java develop");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
