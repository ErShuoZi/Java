package reflection_;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author liushuo
 * @version 1.0
 * 反射问题引入
 */
public class ReflectionQuestion {

    public static void main(String[] args) throws Exception {
        //根据配置文件 re.properties 指定的内容,创建Cat对象并调用方法
        //传统方法
//        Cat cat = new Cat();
//        cat.hi();
//        cat.cry();

        //尝试io方式
        //1.使用Properties类可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileReader("src/re.properties"));

        String classfullpath = properties.get("classfullpath").toString();
        System.out.println(classfullpath);
        String methodName = properties.get("method").toString();

        //创建对象
        //new classfullpath //error

        //使用反射机制
        /**
         * 1.加载类,返回一个Class类型的对象
         * 2.通过aClass 得到加载的类 reflection_.Cat 的对象实例
         * 3.通过 aClass 得到加载的类 reflection_.Cat 的 methodName 的方法对象,即在反射机制中可以把方法视为对象
         * 4.通过method1来调用对象:即通过方法对象来实现调用方法
         */
        Class<?> aClass = Class.forName(classfullpath);
//        Cat o = (Cat)aClass.newInstance();
        Object o = aClass.newInstance();
        Method method1 = aClass.getMethod(methodName);
        System.out.println(method1);  //public void reflection_.Cat.hi()
        System.out.println("----");
        method1.invoke(o); //传统方法: 对象.方法  在反射机制里: 方法.invoke(对象)



    }


}
