package Fuxi;

public class T10Demo {
    public static void main(String[] args) throws InterruptedException {
        //创建Ruanble实现类对象
        T10 t=new T10();
        //创建线程并把实现类对象当作参数进行传递，并给个名字
        Thread t1=new Thread(t,"窗口1");
        Thread t2=new Thread(t,"窗口2");
        Thread t3=new Thread(t,"窗口3");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(300);
        for (int i = 0; i <=200 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
