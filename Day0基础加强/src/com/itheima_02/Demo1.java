package com.itheima_02;

import com.itheima_01.Person;

import java.lang.reflect.Field;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        //获取class文件
        Class p = Person.class;
        //创建Person对象
        Person p1=new Person();
        //获取指定的成员变量
        Field c = p.getField("c");
        c.setAccessible(true);
        //写入对象p1的C变量的值· ·
        c.set(p1,"8");
        System.out.println(p1);
        System.out.println("------------------------");
        //获取所有public修饰的成员变量
        Field[] fields = p.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=====================");
        //获取所有的成员变量，不考虑修饰符
        Field[] df = p.getDeclaredFields();
        for (Field field : df) {
            System.out.println(field);
        }
        //获取指定的成员变量
        Field name = p.getDeclaredField("name");
        //暴力反射
        name.setAccessible(true);
        name.set(p1,"张无忌");
        System.out.println(p1);
    }
}
