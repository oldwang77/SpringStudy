package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;

public class UserService {

    // 创建UserDao类属性
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add...");

        // 调用userdao
        userDao.update();
    }
}
