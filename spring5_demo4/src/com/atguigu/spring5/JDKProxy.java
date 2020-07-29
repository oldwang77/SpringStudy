package com.atguigu.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};

        UserDaoImp userDao = new UserDaoImp();
        // 返回增强后的userdao
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1,2);
        System.out.println("result = "+result);
    }
}

// 创建代理对象代码
class UserDaoProxy implements InvocationHandler{

    // 创建的是谁的代理对象，就要把它传进来
    // 通过有参构造传进来
    private Object obj;

    public UserDaoProxy(Object obj){
        this.obj = obj;
    }


    // 增强UserDaoImp中的void add()的功能
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法之前
        System.out.println("方法之前执行"+method.getName());
        // add方法执行
        // 传入add对象和参数
        Object res = method.invoke(obj, args);
        // 方法之后
        System.out.println("方法之后执行"+method.getName());

        return res;
    }
}