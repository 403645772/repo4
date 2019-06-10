package com.itheima_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class T3fan {
    public static void main(String[] args) throws Exception {
        //创建对象，构造方法中传递字节输入流
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\c.txt"));
        //2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
        Object o = ois.readObject();
        //释放资源
        ois.close();
        //使用读取出来的对象（打印）
        T3Student s=(T3Student)o;
        System.out.println("姓名："+s.getName()+"\r\n"+"年龄："+s.getAge()+"岁"+"\r\n"+"性别："+s.getXing());
    }
}
