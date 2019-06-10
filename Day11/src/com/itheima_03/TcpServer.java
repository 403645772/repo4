package com.itheima_03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(8888);
        Socket accept = socket.accept();

        InputStream is = accept.getInputStream();
        int len=0;
        byte[] bytes=new byte[1024*10];
        File file= new File("D:\\pen");
        if (!file.exists()){
            file.mkdirs();
        }
        FileOutputStream fos=new FileOutputStream("D:\\pen\\int.txt");
        while ((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
            // System.out.println(new String(bytes,0,len));
        }
        OutputStream os = accept.getOutputStream();
        os.write("上传完成...".getBytes());
       // System.out.println("上传完成。。。");
        fos.close();
       accept.close();
       socket.close();
    }
}
