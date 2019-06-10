package com.itheima_01;

import java.io.Serializable;

public class T3Student implements Serializable {
    private String name;
    private int age;
    private  String xing;

    public T3Student() {
    }

    public T3Student(String name, int age, String xing) {
        this.name = name;
        this.age = age;
        this.xing = xing;
    }

    @Override
    public String toString() {
        return "T3Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", xing='" + xing + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getXing() {
        return xing;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }
}
