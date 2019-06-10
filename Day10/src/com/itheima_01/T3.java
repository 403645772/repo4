package com.itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\c.txt"));
        oos.writeObject(new T3Student("小可爱",19,"女"));
        oos.close();
    }
}
