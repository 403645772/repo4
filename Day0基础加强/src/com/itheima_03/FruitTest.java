package com.itheima_03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FruitTest {
    public static void main(String[] args) throws Exception {
         ZZj z=new ZZj();
         while (true){
         BufferedReader br=new BufferedReader(new FileReader("Day0基础加强\\pro.properties"));
         //一次读一行
        String s = br.readLine();
        //获取字节码文件
        Class Cls = Class.forName(s);
        //
       Fruit f = (Fruit) Cls.newInstance();
       //
       z.run(f);
       //睡眠半秒
        Thread.sleep(500);
    }
    }
}
