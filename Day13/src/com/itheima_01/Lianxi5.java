package com.itheima_01;

import java.util.stream.Stream;



public class Lianxi5 {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream = Stream.of("张三丰", "高勇辉", "丁贺辉", "陈新新", "程越越", "张无忌");
        //遍历并输出
        stream.filter((name)->name.startsWith("张")).forEach(name-> System.out.println(name));
        System.out.println("-------------------------");


        //创建一个Stream流，使用链式表达式进行遍历输出
        Stream.of("张三丰", "高勇辉", "丁贺辉", "陈新新", "程越越", "张无忌").filter(name->name.startsWith("张")).forEach(name-> System.out.println(name));
    }
}


