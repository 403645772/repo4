package com.itheima_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FuWuQi {
    public static void main(String[] args) throws IOException {
        //
        ServerSocket socket=new ServerSocket(10010);
        Socket ac = socket.accept();
        //获取并返回
        InputStream is = ac.getInputStream();
        byte[]bytes =new byte[1024*10];
        int len=is.read(bytes);
        //转换为字符串
        System.out.println(new String(bytes,0,len));
        //返回一个数据
        OutputStream os = ac.getOutputStream();
        os.write("好嗨哟！".getBytes());
        os.close();
        is.close();
        socket.close();
    }
}
