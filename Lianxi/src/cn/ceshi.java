package cn;

import java.util.ArrayList;

public class ceshi {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>( );
        list.add("aaa");
        list.add("java");
        list.add("java");
        list.add("javaja");
        list.add("bbb");
        for (int i = list.size()-1; i>=0;i--) {
            if (list.get(i).contains("java")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
