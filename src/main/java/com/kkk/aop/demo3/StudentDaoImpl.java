package com.kkk.aop.demo3;

/**
 * @Time : 2021/4/6 20:52
 * @Author : KKK
 * @File : StudentDaoImpl.java
 * @Software: IntelliJ IDEA
 **/
public class StudentDaoImpl implements StudentDao{
    public void find() {
        System.out.println("学生查询..");
    }

    public void save() {
        System.out.println("学生保存..");

    }

    public void update() {
        System.out.println("学生修改..");

    }

    public void delete() {
        System.out.println("学生删除..");

    }
}
