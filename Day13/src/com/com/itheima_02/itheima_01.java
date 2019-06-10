package com.com.itheima_02;

import java.util.ArrayList;

public class itheima_01 {
    public static void main(String[] args) {
        //创建集合存储名字
        ArrayList<String> s=new ArrayList<>();
        s.add("张无忌");
        s.add("张三");
        s.add("张三丰");
        s.add("周芷若");
        s.add("赵敏");
        s.stream()
                //对集合进行便利然后筛选出姓张的名字
                .filter(name->name.startsWith("张"))
                //对集合遍历判断名字的胀肚是否为3个字
                .filter(name->name.length()==3)
                //对集合B便利并且打印结果(判断之后的数组会放到一个新的数组里)
                .forEach(name-> System.out.println(name));
        ;
    }
}
