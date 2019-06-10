package com.itheima_01;

import java.util.stream.Stream;

public class Lianxi2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张无忌", "周芷若", "赵敏", "张西岚");
        //对Stream流进行遍历筛选出姓张的人名
       stream.filter((String name)->name.startsWith("张"))
        //对Stream流进行遍历筛选出长度为3的人名
       .filter((String name)->name.length()==3)
        //对Stream流进行遍历，打印筛选出来的结果（此遍历会把筛选出来的结果放到一个新的Stream流中）
        .forEach((String name)-> System.out.println(name));

    }
}
