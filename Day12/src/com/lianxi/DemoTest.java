package com.lianxi;

public class DemoTest {
    public  static  void s(int len,Demo d){
        if (len==1){
            System.out.println(d.show());
        }
    }
    public static void main(String[] args) {
        String s="hello";
        String s1="你好";
        s(1,()->s + s1);
    }
}
