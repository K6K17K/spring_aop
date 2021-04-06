package com.kkk.aop.dome1;

/**
 * @Time : 2021/4/6 1:44 下午
 * @Author : KKK
 * @File : UserDaoImpl.java
 * @Software: IntelliJ IDEA
 **/
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("保存用户");
    }

    public void update() {
        System.out.println("修改用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }

    public void find() {
        System.out.println("查询用户");
    }
}
