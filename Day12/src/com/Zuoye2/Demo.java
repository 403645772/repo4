package com.Zuoye2;

public class Demo {
    public static void decToHex(int num ,NumberToString nts){
        String s = nts.convert(num);
        System.out.println(s);
    }


    public static void main(String[] args) {
        decToHex(1000, new NumberToString() {
            @Override
            public String convert(int num) {
                //转化为十六进制
                 return Integer.toHexString(num);
            }
        });
        decToHex(100,(nts)->{
            return Integer.toHexString(100);
        });
    }
}
