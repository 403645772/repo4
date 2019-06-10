package com.itheima_06;

import java.util.function.Consumer;

public class Demo {
    public static void get(String name , Consumer<String> com1,Consumer<String> con2){
       //com1.accept(name);
      // con2.accept(name);
       con2.andThen(com1).accept(name);
    }
    public static void main(String[] args) {
        get("马尔扎哈",(s1)->{
            System.out.println("con1:"+s1);
        },(s2)->{
            System.out.println("con2:"+s2);
        });
    }
}
