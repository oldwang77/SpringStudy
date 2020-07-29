package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// 注解中的value属性值可以省略不写
// 默认值就是类名称（首字母小写）userService
// 等同于bean id ="UserService class='..'

// 注解内的value可以省略不写，默认是类名首字母小写，即userService
// @Component(value = "userService")
@Service
public class UserService {

    //定义Dao对象
    //不需要添加set方法，直接添加注入属性的注解
    @Autowired
    @Qualifier(value = "userDaoImp1")
    private UserDao userDao;

    public void add(){
        System.out.println("service add...");
        userDao.add();
    }
}
