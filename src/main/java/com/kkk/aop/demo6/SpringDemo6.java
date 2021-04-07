package com.kkk.aop.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Time : 2021/4/7 1:26 下午
 * @Author : KKK
 * @File : SpringDemo6.java
 * @Software: IntelliJ IDEA
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo6 {

    @Resource(name = "studentDao")
    private StudentDao studentDao;
    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void demo1() {
        studentDao.find();
        studentDao.save();
        studentDao.delete();
        studentDao.update();

        customerDao.save();
        customerDao.find();
        customerDao.update();
        customerDao.delete();
    }

}
