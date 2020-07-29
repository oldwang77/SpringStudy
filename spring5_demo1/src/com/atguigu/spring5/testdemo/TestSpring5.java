package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.User;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        // 1加载Spring的配置文件'
        // ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2获取配置创建的对象
        // User user = context.getBean("user", User.class);
        // System.out.println(user);
        // user.add();

        // 3set注入
        // Book book = context.getBean("book", Book.class);
        // System.out.println(book);
        // book.testDemo();

        // 4 构造函数注入
        // Book book2 = context.getBean("book2",Book.class);
        // System.out.println(book2);
        // book2.testDemo();

        // 5 测试注入对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();

    }
}
