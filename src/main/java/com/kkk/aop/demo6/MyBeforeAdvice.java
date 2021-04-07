package com.kkk.aop.demo6;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Time : 2021/4/6 20:57
 * @Author : KKK
 * @File : MyBeforeAdvice.java
 * @Software: IntelliJ IDEA
 **/
public class MyBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("这是前置增强=========");
    }
}
