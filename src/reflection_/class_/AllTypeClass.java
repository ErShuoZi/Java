package reflection_.class_;

import java.io.Serializable;

/**
 * @author liushuo
 * @version 1.0
 * 哪些类型有Class类对象
 */
public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> cls1 = String.class; //外部类
        Class<Serializable> cls2 = Serializable.class; //接口也可以有Class对象
        Class<Integer[]> cls3 = Integer[].class; //数组
        Class<float[][]> cls4 = float[][].class;//二维数组
        Class<Deprecated> cls5 = Deprecated.class; //注解
        Class<Thread.State> cls6 = Thread.State.class;//枚举
        //基本数据类型同样存在


        Class<Void> cls7 = void.class;
        Class<Class> cls8 = Class.class;
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
        System.out.println(cls5);
        System.out.println(cls6);
        System.out.println(cls7);
        System.out.println(cls8);


    }
}
