package com.lianxi1;

public class Shuzu {
    public static int  show(zuidazhi z){
          return  z.max();
    }

    public static void main(String[] args) {
        int[] a = {11, 22, 55, 77, 88, 33, 66, 99, 11111, 222, 52, 5532, 455, 4634, 341, 674, 1631};
        int c = show(() -> {
            int b = a[0];
            for (int i : a) {
                if (i > b) {
                    b = i;
                }
            }
            return b;
             });
        System.out.println("最大值为：" + c);
    }

}
