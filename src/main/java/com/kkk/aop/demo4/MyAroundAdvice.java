package com.kkk.aop.demo4;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Time : 2021/4/6 21:26
 * @Author : KKK
 * @File : MyAroundAdvice.java
 * @Software: IntelliJ IDEA
 **/
public class MyAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前增强。。。。。");
        Object obj=methodInvocation.proceed();
        System.out.println("环绕后增强。。。。。");

        return obj;
    }
}
