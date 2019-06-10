package com.itheima_03;

import java.io.*;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\out.txt");
        Socket s=new Socket("192.168.17.27",8888);
        OutputStream os= s.getOutputStream();
        int len=0;
        byte[] bytes=new byte[1024*10];
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
       s.shutdownOutput();

        InputStream is = s.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        s.close();
    }
}
