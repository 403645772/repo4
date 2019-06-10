package com.itheima_05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("D:\\out.txt");
        Socket s=new Socket("127.0.0.1",9999);
        OutputStream os = s.getOutputStream();
        int  len =0;
        byte[] bytes=new byte[1024];
        while ((len=file.read(bytes))!=-1){
            os.write(bytes,0,len);

        }
        s.shutdownOutput();

        InputStream is = s.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        is.close();
        os.close();
        s.close();
    }
}
