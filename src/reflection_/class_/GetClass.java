package reflection_.class_;

import reflection_.Cat;

/**
 * @author liushuo
 * @version 1.0
 * 得到Class类对象的各种方式
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式1.已知全类名,且该类在类路径下,可通过Class的静态方法forName()获取.应用场景:多用于配置文件,读取全类名,加载类
        //Class.forName()
        String classfullname = "reflection_.Cat";
        Class<?> cls1 = Class.forName(classfullname);
        System.out.println(cls1);
        //方式2.通过类名.class 应用场景:多用于参数传递,通过反射得到对应构造器对象
        Class<Cat> cls2 = Cat.class;
        System.out.println(cls2);

        //方式3.若已知具体的类的实例(对象),调用该实例的getClass方法获取
        Cat cat = new Cat();
        Class cls3 = cat.getClass();
        System.out.println(cls3);

        //4.通过类加载器(4种)获取到Class类对象
        //(1)先得到类加载器 cat
        ClassLoader classLoader = cat.getClass().getClassLoader();
        //(2)通过类加载器得到Class类对象
        Class<?> cls4 = classLoader.loadClass(classfullname);
        System.out.println(cls4);


        //cls1 - cl4 是同一个对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());


        //5.基本数据类型.class
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass); //int

        //6.基本数据类型对应包装类
        Class<Integer> integerClass1 = Integer.TYPE;
        System.out.println(integerClass1); //int

        System.out.println(integerClass.hashCode());
        System.out.println(integerClass1.hashCode());

    }
}
