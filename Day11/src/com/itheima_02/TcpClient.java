package com.itheima_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\out.txt");
        Socket s=new Socket("192.168.43.240",8888);
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
