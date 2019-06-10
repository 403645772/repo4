package itcast;

import cn.Person;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest5 {
    public static void main(String[] args) throws Exception {
        while (true){ //创建properties集合
        Properties p=new Properties();
        //用类的加载器把这个文件放到内存中
        InputStream rs = ReflectTest5.class.getClassLoader().getResourceAsStream("pro.properties");
        //把文件放入到properties集合中
        p.load(rs);
        //找到当前类的字节码文件
        Class rc = ReflectTest5.class;
        //获取配置文件中的数据
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");

        //3加载该类进内存
        Class Cls = Class.forName(className);
        //
        Object o = Cls.newInstance();
        //5获取方法对象
        Method method = Cls.getMethod(methodName);
        method.invoke(o);
        Thread.sleep(500);
    }
}
}
