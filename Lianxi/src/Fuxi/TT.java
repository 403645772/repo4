package Fuxi;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class TT {
            public static void main(String[] args) throws IOException, IOException {
                BufferedReader br =
                        new BufferedReader(new FileReader("test.txt"));
                BufferedWriter bw =
                        new BufferedWriter(new FileWriter("test.txt"));
                String str = br.readLine();
                if(str !=null){
                    bw.write("官网："+str);
                    bw.flush();
                }
                br.close();
                bw.close();
            }
        }

