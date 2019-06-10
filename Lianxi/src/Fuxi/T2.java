package Fuxi;

public class T2 {
    public static void main(String[] args) {
        Thread a = new Thread() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i <= 100; i++) {
                    a = a + i;
                }
                System.out.println("a:"+a);
            }
        };
        a.start();
        Thread b= new Thread(){
            @Override
            public void run() {
                int b=0;
                for (int i = 0; i <=200 ; i++) {
                    b=b+i;
                }
                System.out.println("b:"+b);
            }
        };
        b.start();
    }
}
