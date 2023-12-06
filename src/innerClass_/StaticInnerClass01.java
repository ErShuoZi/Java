package innerClass_;

/**
 * 静态内部类
 * 1.可以直接访问外部类中的所有静态成员.但不能直接访问非静态成员
 * 2.可以任意添加修饰符
 * 3.作用域:整个类体
 */
public class StaticInnerClass01 {
    public static void main(String[] args) {
        //外部其他类使用静态内部类
        //1.
        Outer10.Inner10 inner10 = new Outer10.Inner10();
    }
}

class Outer10 { //外部类
    private int n1 = 10;
    private static String name = "张三";
    static class Inner10{ //静态内部类

    }
}
