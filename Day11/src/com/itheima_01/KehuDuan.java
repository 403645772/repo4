package com.itheima_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class KehuDuan {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.17.27",8888);
        //写入返回数据
        OutputStream os = socket.getOutputStream();
        os.write("好嗨哟！".getBytes());
        InputStream is = socket.getInputStream();
        //创建数组提高效率
        byte[] bytes=new byte[1024*10];
        int len=is.read(bytes);
        //输出并转换为字符串类型
        System.out.println(new String(bytes,0,len));
        is.close();
        os.close();
        socket.close();
    }
}
