package itcast;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest6 {
    public static void main(String[] args) throws Exception {
        //创建一个Properties集合
        Properties p=new Properties();
        //返回的一个IO流                      类的加载器
        InputStream rs = ReflectTest6.class.getClassLoader().getResourceAsStream("pro.properties");
            p.load(rs);
            //搜索指定的键，通过键来获取值
        String className = p.getProperty("className");

        String methodName = p.getProperty("methodName");
        //上传类到运行内存中
        Class Cls = Class.forName(className);
        //通过类找到这个方法
        Method method = Cls.getMethod(methodName);
        //创建当前类的对象并接收
        Object o = Cls.newInstance();

        method.invoke(o);

    }
}
