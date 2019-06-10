package com.itheima_01;

import java.io.*;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class T1 {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            time();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\t.dll"));
            Date d = (Date) ois.readObject();
            long t = d.getTime();
            long l = System.currentTimeMillis();
            if ((l - t) / 1000 / 60 - 5 > 0) {
                System.out.println("请使用正版，注册会员后免费使用。。。");
            }else {
                System.out.println("祝你越来越胖。。。");
            }
        }

    private static void time() throws IOException {
        System.out.println("欢迎使用本软件。。。");
        Date d=new Date();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\t.dll"));
         oos.writeObject(d);
    }

}
