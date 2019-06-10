package Fuxi;

import java.util.ArrayList;
import java.util.Collections;

public class T1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String[] colos={"♠","♣","♥","♦"};
        String[] number={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        list.add("大王");
        int a=0;
        list.add("小王");
        for (String s : number) {
            for (String colo : colos) {
                list.add(colo+s);
            }
        }
        Collections.shuffle(list);
        ArrayList<String>play1=new ArrayList<>();
        ArrayList<String>play2=new ArrayList<>();
        ArrayList<String>play3=new ArrayList<>();
        ArrayList<String>dipai=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);


            if (i>=51){
                dipai.add(s);
            }else if (i%3==0){
                play1.add(s);
            }else if (i%3==1){
                play2.add(s);
            }else if (i%3==2){
                play3.add(s);
            }
        }

        System.out.println(play1);
        System.out.println(play2);
        System.out.println(play3);
        System.out.println(dipai);
}
}

