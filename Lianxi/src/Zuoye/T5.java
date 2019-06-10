package Zuoye;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class T5 {
    public static void main(String[] args) throws Exception {
        Properties pop=new Properties();
        pop.setProperty("小米","1888");
        pop.setProperty("红米","1666");
        pop.setProperty("黑米","1866");
        //写入集合数据到文件
        pop.store(new FileWriter("D:\\user.txt"),"");
       /* Set<String> a = pop.stringPropertyNames();
        for (String s : a) {
            String aa = pop.getProperty(s);
            System.out.println(s+" "+aa);
        }
*/
    }
}
