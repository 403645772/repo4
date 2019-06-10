package com.itheima_04;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建集合
        Properties p=new Properties();
        InputStream rs = Test.class.getClassLoader().getResourceAsStream("aaaaa");
        p.load(rs);
        System.out.println(p);
        //获取字节码文件
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");
        Class Cls = Class.forName(className);
        //创建对象并接受
        Object o = Cls.newInstance();
        //获取对象方法
        Method method = Cls.getMethod(methodName);
          method.invoke(o);

    }
}
