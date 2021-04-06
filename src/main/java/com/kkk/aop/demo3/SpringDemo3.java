package com.kkk.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Time : 2021/4/6 21:10
 * @Author : KKK
 * @File : SpringDemo3.java
 * @Software: IntelliJ IDEA
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {
    //@Resource(name = "studentDao")
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;
    @Test
    public void demo1() {
        studentDao.save();
        studentDao.delete();
        studentDao.find();
        studentDao.update();
    }
}
