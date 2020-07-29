package com.atguigu.spring5.aopano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 增强类
@Component
@Aspect
public class UserProxy {

    // 前置通知
    // Before注解表示作为前置注解
    @Before(value = "execution(* com.atguigu.spring5.aopano.User.add(..))")
    public void before(){
        System.out.println("before...");
    }

    // 后置通知（返回通知）
    @After(value = "execution(* com.atguigu.spring5.aopano.User.add(..))")
    public void after(){
        System.out.println("after...");
    }

    // 最终通知
    @AfterReturning(value = "execution(* com.atguigu.spring5.aopano.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.atguigu.spring5.aopano.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    // 环绕增强，在方法前和方法后都增强
    @Around(value = "execution(* com.atguigu.spring5.aopano.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("around前...");
        // 被增强方法执行
        proceedingJoinPoint.proceed();
        System.out.println("around后");
    }
}
