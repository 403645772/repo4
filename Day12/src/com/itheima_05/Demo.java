package com.itheima_05;

import java.util.function.Supplier;

public class Demo {
    public static int get(Supplier<Integer> s) {
        return s.get();
    }
    public static void main(String[] args) {
        int[] a = {11, 55, 66, 4, 3, 4585, 778, 665, 77897};
        int c = get(() -> {
            int b = a[0];
            for (int i : a) {
                if (i > b) {
                    b = i;
                }
            }
            return b;
        });
        System.out.println("最大值为：" + c);
        int d = get(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int b = a[0];
                for (int i : a) {
                    if (i > b) {
                        b = i;
                    }
                }
                return b;
            }
        });
        System.out.println("最大值为：" + d);
    }
}
