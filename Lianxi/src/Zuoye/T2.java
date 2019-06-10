package Zuoye;

import java.io.*;
import java.util.*;

public class T2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\user.txt",true);
        Properties po=new Properties();
        po.setProperty("jack","123");
        po.setProperty("top","123");
        po.setProperty("lucky","123");
        Scanner s=new Scanner(System.in);
        Set<String> a = po.stringPropertyNames();
        for (String ss : a) {
            String aa = po.getProperty(ss);
        while (true) {
            System.out.println("请输入用户名:");
            String username = s.nextLine();
            if (username.equals(ss)) {
                System.out.println("用户名已存在");
                //return;
            } else {
                System.out.println("请输入密码:");
                String password = s.nextLine();
                fw.write("\r\n"+username+","+password);
                //刷新一下缓存
                fw.flush();
                System.out.println("保存成功");
                return;
            }
        }
        }
    }
        }







