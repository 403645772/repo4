package itcast;

import cn.Person;

import java.lang.reflect.Constructor;

public class ReflectTest3 {
    public static void main(String[] args) throws Exception {
        Class pc = Person.class;
        //获取构造方法
        Constructor cs = pc.getConstructor(String.class,int.class);
        System.out.println(cs);
        //获取构造方法的类名
        String name = cs.getName();
        System.out.println(name);
        System.out.println("----------------------");
        //创建对象，并传入参数
        Object o = cs.newInstance("张三", 19);
        System.out.println(o);
        //空参构造方法
        Object o1 = pc.newInstance();
        System.out.println(o1);
    }
}
