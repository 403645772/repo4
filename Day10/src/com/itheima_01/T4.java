package com.itheima_01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class T4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String>list=new ArrayList<>();
        BufferedReader bis=new BufferedReader(new FileReader("D:\\in.txt"));
        BufferedWriter bos=new BufferedWriter(new FileWriter("D:\\out.txt"));
          String len;
          while ((len=bis.readLine())!=null){
              list.add(len);
          }
        Collections.sort(list);
        for (String s : list) {
            bos.write(s);
            bos.newLine();
        }
        bos.close();
        bis.close();
    }
}
