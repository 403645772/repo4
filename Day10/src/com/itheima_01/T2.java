package com.itheima_01;

import java.awt.image.DataBufferDouble;
import java.io.*;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个路径");
        String s1 = s.nextLine();

        BufferedInputStream br;
        BufferedOutputStream bw;
        br=new BufferedInputStream(new FileInputStream(s1));
        bw=new BufferedOutputStream(new FileOutputStream("D:\\avi.mp4"));
        byte[] bytes=new byte[1024*10];
        int len=0;
        while ((len=br.read(bytes))!=-1){
            bw.write(bytes,0,len);
        }
        bw.close();
        br.close();
    }
}
