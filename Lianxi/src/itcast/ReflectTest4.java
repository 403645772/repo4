package itcast;

import cn.Person;

import java.lang.reflect.Method;

public class ReflectTest4 {
    public static void main(String[] args) throws Exception {
        Class p = Person.class;
        //获取指定名称的方法
      //  Method m = p.getMethod("eat");
       Person p1=new Person();
        //执行方法
     //   m.invoke(p1);
        Method eat = p.getMethod("eat", String.class);
        eat.invoke(p1,"dasdasdass");
        System.out.println("--------------------");
        Method[] dm = p.getDeclaredMethods();
        for (Method method : dm) {
            String name = method.getName();
            System.out.println(name);

           // System.out.println(method);
        }
    }
}
