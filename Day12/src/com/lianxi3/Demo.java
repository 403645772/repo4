package com.lianxi3;

import java.util.function.Consumer;

public class Demo {
    public static void zz(String name , Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);

    }

    public static void main(String[] args) {
        zz("马尔扎哈",(con1)->{
            System.out.println("con1"+con1);
        },(con2)->{
            System.out.println("con2:"+con2);
        });
    }
}
