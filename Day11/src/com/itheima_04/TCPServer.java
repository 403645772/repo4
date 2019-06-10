package com.itheima_04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.17.103", 10000);

        while (true) {

            try {
                //发送线程
                Scanner sc = new Scanner(System.in);
                System.out.print("客户端：");
                String wordC = sc.nextLine();
                OutputStream os = socket.getOutputStream();
                os.write(wordC.getBytes());

                //接收线程
                InputStream is = socket.getInputStream();
//				BufferedReader br = new BufferedReader(new InputStreamReader(is));
//				String wordS = br.readLine();
                byte[] bytes = new byte[1024];
                int len = is.read(bytes);
                System.out.println("服务器：" + new String(bytes, 0, len));

            } catch (Exception e) {
                e.printStackTrace();
            }

//			//发送线程
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					try {
//						Scanner sc = new Scanner(System.in);
//						System.out.print("客户端：");
//						String word = sc.nextLine();
//						OutputStream os = socket.getOutputStream();
//						os.write(word.getBytes());
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}).start();
//
//			//接收线程
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					try {
//						InputStream is = socket.getInputStream();
//						BufferedReader br = new BufferedReader(new InputStreamReader(is));
//						String word = br.readLine();
//						System.out.println("服务器：" + word);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}).start();
        }

        //socket.close();
    }
}


