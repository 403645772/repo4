package com.itheima_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class T1_1 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        os.write("你好服务器".getBytes());
        byte[] bytes=new byte[1024*10];
        int len=is.read(bytes);
        System.out.println(len);

    }
}
