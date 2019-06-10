package com.itheima_02;

public class TestDemo {
    public static void show(int level ,Message m){
  
        if (level==2){
            System.out.println(m.pin());
        }
    }
    public static void main(String[] args) {
        String s="hello";
        String s1="world";
        String s2="java";
        show(1,()->{
            System.out.println("执行了。。。");
            return s+s1+s2;
        });
    }


}
