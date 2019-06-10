package itcast;

import cn.Person;

import java.lang.reflect.Field;

public class ReflectTest2 {
    public static void main(String[] args) throws Exception {
        Class p = Person.class;
        Field[] fields = p.getFields();

        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("---------------");
        Field a = p.getField("a");
        Person p1=new Person();
        a.set(p1,20);
        Object o = a.get(p1);
        System.out.println(o);
        System.out.println("---------------------");
        Field[] df = p.getDeclaredFields();

        for (Field field : df) {
            System.out.println(field);
            System.out.println("---------------------");

        }
        Field name = p.getDeclaredField("name");
        name.setAccessible(true);
        Object o1 = name.get(o);
        System.out.println(o1);
    }
}
