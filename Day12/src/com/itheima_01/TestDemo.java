package com.itheima_01;

public class TestDemo {
    public static void main(String[] args) {
        Interface in = new Interface() {
            @Override
            public void show() {
                System.out.println("我是正常类。。。");
            }
        };
        in.show();
        show1(new Interface() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类。。。");
            }
        });
        //正常lambad表达式
        show1(()->{
            System.out.println("我是lambad表达式。。。");
        });
        //简化lambad表达式
        show1(() ->
                System.out.println("我是简化lambad表达式。。。"));
    }
    //创建一个实现类，把抽象方法定位参数传递
    public static void show1(Interface i) {
        //调用show1方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        i.show();
    }
}
