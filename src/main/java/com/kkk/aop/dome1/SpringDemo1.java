package com.kkk.aop.dome1;

import org.junit.Test;

/**
 * @Time : 2021/4/6 1:51 下午
 * @Author : KKK
 * @File : SpringDemo1.java
 * @Software: IntelliJ IDEA
 **/
public class SpringDemo1 {
    @Test
    public void demo1(){
        UserDao userDao=new UserDaoImpl();

        UserDao proxy= (UserDao) new MyJdkProxy(userDao).createProxy();

        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
