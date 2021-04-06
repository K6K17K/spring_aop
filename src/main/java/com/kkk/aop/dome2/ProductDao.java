package com.kkk.aop.dome2;

/**
 * @Time : 2021/4/6 18:59
 * @Author : KKK
 * @File : ProductDao.java
 * @Software: IntelliJ IDEA
 **/
public class ProductDao {
    public void save() {
        System.out.println("保存商品");
    }

    public void update() {
        System.out.println("修改商品");
    }

    public void delete() {
        System.out.println("删除商品");
    }

    public void find() {
        System.out.println("查询商品");
    }

}
