package com.itheima_03;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lian1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("Day10\\a.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[] bytes = "你好世界，你好java".getBytes();
        bos.write(bytes);
        bos.close();
    }
}
