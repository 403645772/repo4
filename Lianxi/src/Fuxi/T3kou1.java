package Fuxi;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T3kou1 extends T3 implements Runnable {
    private int piao;

    @Override
    public void setPiao(int piao) {
        this.piao = piao;
    }
    Lock c=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            c.lock();
            if (piao>0){
                try {
                    Thread.sleep(200);
                    System.out.println("正在卖"+piao+"张票");
                    piao--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    c.unlock();
                }
            }
        }
    }
}
