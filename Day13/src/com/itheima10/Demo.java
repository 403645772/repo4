package com.itheima10;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("你好");
        list1.add("张天爱");
        list1.add("张无敌");
        list1.add("张三丰");
        Stream<String> list1Stream = list1.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> list2 = new ArrayList<>();
        list1.add("张羊羊");
        list1.add("张羊羊");
        list1.add("懒羊羊");
        list1.add("张灰灰");
        list1.add("灰太狼");
        list1.add("红太狼");
        Stream<String> list2Stream = list2.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream.concat(list1Stream, list2Stream).map(name->new Person(name)).forEach(p-> System.out.println(p));
    }
}
