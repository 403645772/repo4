package com.itheima_03;

import java.io.*;

public class Lian3 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\aa.txt"),"gbk");
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\bb.txt"));
        int len=0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();

    }
}
