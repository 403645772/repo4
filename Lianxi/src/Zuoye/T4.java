package Zuoye;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class T4 {
    public static void main(String[] args) throws Exception {
        Properties pop =new Properties();
        //读取文件数据到集合
        pop.load(new FileReader("D:\\user.txt"));
        Set<String> a = pop.stringPropertyNames();
        for (String s : a) {
            String aa = pop.getProperty(s);
            System.out.println(s+"  "+aa);
        }
    }
}
