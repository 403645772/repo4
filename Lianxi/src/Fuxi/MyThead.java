package Fuxi;

public class MyThead  extends  Thread{
    public void start(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("Value="+i);
        }
    }
}
