package Fuxi;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Handler;

public class T9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = s.nextLine();
        //创建map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character ,Integer>  map=new HashMap<>();
        //遍历字符串，获取每一个字符
        for (Character c:s1.toCharArray()){
            //使用获取到的字符，区Map集合判断key是否存在
            if (map.containsKey(c)){
                //key存在
                Integer integer = map.get(c);
                integer++;
                map.put(c,integer);
            }else{
                //key不存在
                map.put(c,1);
            }
        }
        for (Character key:map.keySet()){
            Integer integer = map.get(key);
            System.out.println(key+"   "+integer);
        }
    }

}
