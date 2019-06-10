package com.Zuoye1;

public class Demo {
    public static void showLongTime(long l, CurrentTimePrinter timePrinter) {
        timePrinter.printCurrentTime();
    }

    public static void main(String[] args) {
        long l = System.currentTimeMillis();

        showLongTime(l, new CurrentTimePrinter() {
            @Override
            public void printCurrentTime() {
                System.out.println("匿名内部类实现。。。"+"当前时间的毫秒值为："+l);
            }
        });

        showLongTime(l,() -> {
            System.out.println("当前时间的毫秒值为："+l);
        });
    }
}
