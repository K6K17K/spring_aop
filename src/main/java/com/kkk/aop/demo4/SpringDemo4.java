package com.kkk.aop.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Time : 2021/4/6 21:34
 * @Author : KKK
 * @File : SpringDemo4.java
 * @Software: IntelliJ IDEA
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")

public class SpringDemo4 {
    //@Resource(name = "customerDao")
    @Resource(name="customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void demo1(){
        customerDao.find();
        customerDao.save();
        customerDao.update();
        customerDao.delete();
    }
}
