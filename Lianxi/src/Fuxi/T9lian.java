package Fuxi;

import java.util.HashMap;
import java.util.Scanner;

public class T9lian {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = s.nextLine();
        //创建双列集合
        HashMap<Character ,Integer>map=new HashMap<>();
        //循环遍历集合
        for (Character c:s1.toCharArray()){
            //如果集合中的key值与输入的相同，则让value值++；
          if ( map.containsKey(c)){//是否包含指定的键
              Integer integer = map.get(c);
              integer++;
              //再次放入到集合中
              map.put(c,integer);
              //无重复则默认为1
          }else {
              map.put(c,1);
          }
        }
        //循环遍历集合打印结果
        for (Character key:map.keySet()){//获取集合中的key键
            Integer integer = map.get(key);//获取集合中value值
            System.out.println(key+"   "+integer);//打印输出结果
        }
    }
}
