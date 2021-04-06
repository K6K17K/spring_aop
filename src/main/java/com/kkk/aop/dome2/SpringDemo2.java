package com.kkk.aop.dome2;

import org.junit.Test;

/**
 * @Time : 2021/4/6 19:00
 * @Author : KKK
 * @File : SpringDemo2.java
 * @Software: IntelliJ IDEA
 **/
public class SpringDemo2 {
    @Test
    public void demo1(){
        ProductDao productDao = new ProductDao();

        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();

        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
