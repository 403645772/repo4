package com.itheima_01;

import java.util.stream.Stream;

public class Lianxi {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream= Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用Stream流中的方法forEach对Stream流中的数据进行遍历。
        stream.forEach((String name)->{
            System.out.print(name+" ");
        });
        //使用lambda进行优化
        stream.forEach((name)-> System.out.println(name));
    }
}
