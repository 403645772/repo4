package Fuxi;

public class T6 {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"包子已经做好了，1号开始吃");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"包子已经做好了，2号开始吃");
                        System.out.println("--------------------------");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                        try {
                            Thread.sleep(5000);
                            System.out.println("正在生产包子。。。。");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (obj){
                        System.out.println("包子生产好了，顾客可以吃了。。。。");
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
