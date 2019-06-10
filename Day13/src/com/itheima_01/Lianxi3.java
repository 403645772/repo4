package com.itheima_01;

import java.util.stream.Stream;

public class Lianxi3 {
    public static void main(String[] args) {
        //创建Stream流
        Stream<String> stream = Stream.of("张三丰", "张无忌", "周芷若", "赵敏", "张西岚");
        //对Stream流进行遍历获取姓张的人（获取到的结果会放入一个新的Stream流中）
        Stream<String> stream2 =  stream.filter((String name)->{return  name.startsWith("张");});
        //遍历新的Stream流查看结果
        stream2.forEach(name-> System.out.println(name));
    }
}
