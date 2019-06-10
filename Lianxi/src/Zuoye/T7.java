package Zuoye;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class T7 {
    //定义一个接口，方法返回值类型使用Comparator
    public static Comparator<String>  comparator(){


        //方法的返回值类型是一个接口，我们可以返回匿名内部类接口重写方法
     //   return new Comparator<String>() {
         //   @Override
        //    public int compare(String o1, String o2) {
                //按照字符串的降序排序
           //     return o2.length()-o1.length();
        //    }
    //    };
        //方法的返回值是一个函数式接口,所以我们可以返回一个lanmda表达式
      //  return (String o1, String o2)->{
   //     return  o2.length()-o1.length();
  //      };
          return ((o1, o2) -> o1.length()-o2.length());
    }

    public static void main(String[] args) {
        //创建了一个字符串数组
        String[] s={"aaaa","v","bbbb","cccc","EEEEEEEEEEE"};
        //输出字符串数组
        System.out.println(Arrays.toString(s));
        //调用Comparator函数接口
        Arrays.sort(s,comparator());
        System.out.println(Arrays.toString(s));
    }
}
