package codeBlock_;


import javax.xml.namespace.QName;

/**
 * 创建一个子类对象时候(继承关系),它们的静态代码块,静态属性初始化,普通代码块,普通属性初始化.构造方法的调用顺序如下:
 * 1.父类的静态代码块和静态属性(两者优先级相同,执行顺序根据定义顺序)
 * 2.子类的静态代码块和静态属性(两者优先级相同,执行顺序根据定义顺序)
 * 3.父类的普通代码块和普通属性初始化(两者优先级相同,执行顺序根据定义顺序)
 * 4.父类的构造方法
 * 5.子类的普通代码块和普通属性初始化(两者优先级相同,执行顺序根据定义顺序)
 * 6.子类的构造方法
 */
public class CodeBlockDetails04 {
    public static void main(String[] args) {
        C c = new C();
        /**
         * 根父类静态代码块执行
         * 父类静态代码块执行
         * 子类静态代码块执行
         * 根父类普通代码块执行
         * 根父类构造器执行
         * 父类普通代码块执行
         * 父类构造器执行
         * 子类普通代码块执行
         * 子类构造器执行
         */

    }
}

class F{
    //根父类静态属性初始化
    private static String name;
    //根父类普通属性初始化
    private String hobby;
//    根父类静态代码块
    static {
    System.out.println("根父类静态代码块执行");
}
    //    根父类普通代码块
    {

        System.out.println("根父类普通代码块执行");
    }
    
    public F() {
        System.out.println("根父类构造器执行");
    }
}

class B extends F {

    //父类静态属性初始化
    private static String name;
    //父类普通属性初始化
    private String hobby;
    static {
        System.out.println("父类静态代码块执行");
    }
    {

        System.out.println("父类普通代码块执行");
    }
    public B() {
        System.out.println("父类构造器执行");
    }
}

class C extends B{

    static {
        System.out.println("子类静态代码块执行");
    }
    //    根父类普通代码块
    {

        System.out.println("子类普通代码块执行");
    }

    public C() {
        System.out.println("子类构造器执行");
    }
}
