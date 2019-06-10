package Fuxi;

import java.util.HashMap;
import java.util.Scanner;

public class T9lian2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = s.nextLine();
        //创建双列集合
        HashMap<Character ,Integer>map=new HashMap<>();
        //遍历字符串获取每一个字符
        for (Character c:s1.toCharArray()){
            //如果集合中的key包含字符
            if (map.containsKey(c)){
                //通过key获取value值
                Integer integer = map.get(c);
                //value++
                integer++;
                //重新放入到集合中
                map.put(c,integer);
            }else{
                map.put(c,1);
            }
        }
        for (Character c:map.keySet()){
            Integer integer = map.get(c);
            System.out.println(c+"  "+integer);
        }
    }
}
