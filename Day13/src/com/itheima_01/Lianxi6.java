package com.itheima_01;

import java.util.Arrays;
import java.util.stream.Stream;

public class Lianxi6 {
    public static void main(String[] args) {
        //创建Stream流
        Stream<String> stream = Stream.of("11", "55", "12131", "552165", "55213", "51215", "5152", "556");
        //把字符串类型的元素转换为Integer包装类型的数据
        stream.map(s ->{return  Integer.parseInt(s);}).forEach(d -> System.out.println(d));
        System.out.println("-----------------------------");
        //创建Stream流
        Stream<String> stream1 = Stream.of("11", "55", "12131", "552165", "55213", "51215", "5152", "556");
        //调用Stream流中的limit方法查看流中的前五个元素
        stream1.limit(5).forEach(s -> System.out.print(s+" "));
        System.out.println("--------------------------");
        System.out.println();
        //创建Stream流
        Stream<String> stream2 = Stream.of("11", "55", "12131", "552165", "55213", "51215", "5152", "556");
        //调用Stream流中的方法count获取流中元素的个数
        long count = stream2.count();
        System.out.println(count);
        //创建Stream流，调用Stream流中的skip方法查看变量后的元素
        Stream.of(1, 5, 6, 8, 12, 33).skip(2).forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println("---------------------------");
        //创建Stream流
        Stream<String> stream3 = Stream.of("张无忌");
        //创建String数组
       String[] s={"张一山"};
       //把数组转换为Stream流
        Stream<String> s1 = Stream.of(s);
        //调用Stream的concat方法拼接两个Streeam流
        Stream<String> concat = Stream.concat(stream3, s1);
        //遍历拼接后的Stream流
           concat.forEach(b-> System.out.println(b));

    }
}