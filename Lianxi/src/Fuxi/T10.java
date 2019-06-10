package Fuxi;

public class T10 implements Runnable {
    private  int ticket=300;
  Object obj=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                ticket--;
            }else{
                break;
            }
        }
    }
}
}
