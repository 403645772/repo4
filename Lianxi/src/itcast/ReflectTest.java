package itcast;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1创建Properties对象
        Properties pro=new Properties();
        //1.2加载配置文件，转换为一个集合，加载器加载文件
        ClassLoader is = ReflectTest.class.getClassLoader();
        InputStream ra = is.getResourceAsStream("pro.properties");
        pro.load(ra);
        //2获取配置文件中的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //3加载该类进内存
        Class cls = Class.forName(className);
        //4创建对象
        Object o = cls.newInstance();
        //5获取方法对象
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }
}
