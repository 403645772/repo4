package com.itheima_05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(9999);
        Socket ac = socket.accept();
        File file=new File("D:\\aaa");
        if (!file.exists()){
            file.mkdirs();
        }
        InputStream is = ac.getInputStream();
        FileOutputStream fos=new FileOutputStream("D:\\aaa\\ooo.txt");
        int len=0;
        byte[] bytes=new byte[1024];
        while ((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        OutputStream os = ac.getOutputStream();
        os.write("上传成功。。。".getBytes());
        is.close();
        os.close();
        fos.close();
        socket.close();;
    }
}
