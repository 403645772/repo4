package com.itheima_04;

public class Demo {
    public static void ee(int index,pai p){
        if (index==1){
            System.out.println(p.show());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String s="高勇辉";
        String s1="小胖";
        String s2="29";
          ee(1,()->{
              System.out.println("执行了。。。");
              //返回一个拼接好的字符串
              return s+s1+s2;
          });
    }
}
