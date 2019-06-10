package Zuoye;

public class T6 {
    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //重写run方法
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->");
            }
        });
        //Lanmda表达式,方法的参数是一个函数式接口。
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"----->");
        });
        //lanmda表达式的优化
        startThread(()-> System.out.println(Thread.currentThread().getName()+"----->"));
    }

    }

