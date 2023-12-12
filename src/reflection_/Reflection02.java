package reflection_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author liushuo
 * @version 1.0
 * 测试反射调用性能和优化
 * 传统方法调用hi耗时:2
 * 反射调用hi耗时:107
 * 反射调用hi耗时:82
 */
public class Reflection02 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();
    }

    //传统方法调用hi

    public static void m1() {
        Cat cat = new Cat();
        long start= System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用hi耗时:" + (end - start));
    }

    //反射调用
    public static void m2() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();

        Class<?> aClass = Class.forName(classfullpath);
        Method hi = aClass.getMethod("hi");
        Object obj = aClass.newInstance();


        long start= System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(obj);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射调用hi耗时:" + (end - start));
    }
    //反射调用优化 + 关闭访问检测

    public static void m3() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();

        Class<?> aClass = Class.forName(classfullpath);
        Method hi = aClass.getMethod("hi");
        Object obj = aClass.newInstance();

        hi.setAccessible(true); //取消检测
        long start= System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(obj);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射调用hi耗时:" + (end - start));
    }

}
