package Fuxi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class T7 {
    public static void main(String[] args) throws IOException {
        //写入到d盘的文件夹
        FileWriter fw = new FileWriter("D:\\user.txt", true);
        //创建唯一一个和IO流相结合的集合
        Properties po = new Properties();
        po.setProperty("jack", "123");
        po.setProperty("top", "123");
        po.setProperty("lucky", "123");
        Scanner s = new Scanner(System.in);
        //把集合转换为set集合
        Set<String> a = po.stringPropertyNames();
            while (true) {
                for (String ss : a) {
                    String aa = po.getProperty(ss);
                    System.out.println(ss);
                System.out.println("请输入用户名:");
                String username = s.nextLine();
                if (ss.equals(username)) {
                 //   System.out.println(ss.equals(username));
                    System.out.println("用户名已存在");
                    //return;
                } else {
                    System.out.println("请输入密码:");
                    String password = s.nextLine();
                    try {
                        fw.write("\r\n" + username + "," + password);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //刷新一下缓存
                    fw.flush();
                    System.out.println("保存成功");
                    return;
                }
            }
        }
    }

}




