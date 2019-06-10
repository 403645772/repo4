package com.itheima_03;

import java.io.*;

public class Lian2 {
    public static void main(String[] args) throws Exception {
        //使用字节缓冲流 读取并写入
        BufferedInputStream bfi=new BufferedInputStream(new FileInputStream("D:\\user.txt"));
        BufferedOutputStream bof=new BufferedOutputStream(new FileOutputStream("D:\\ss.txt"));
          int len=0;
          byte[] bytes=new byte[1024];
          while ((len=bfi.read(bytes))!=-1){
               bof.write(bytes,0,len);
          }
          bof.close();
          bfi.close();
    }
}
