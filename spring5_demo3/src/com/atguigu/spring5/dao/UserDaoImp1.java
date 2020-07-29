package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImp1")
public class UserDaoImp1 implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
