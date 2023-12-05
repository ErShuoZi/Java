package codeBlock_;

/**
 * 创建一个对象时,在一个类中的调用顺序是:
 * 1.调用静态代码块和静态属性初始化(注意:静态代码块和静态属性初始化的调用优先级是一样的,如果有多个静态代码块和多个静态属性初始化,则按照它们定义的顺序调用)
 * 2.调用普通代码块和普通属性初始化(注意:普通代码块和普通属性初始化调用优先级是相同的,如果有多个普通代码块和多个普通属性初始化,则按照定义顺序执行)
 * 3.调用构造器
 */
public class CodeBlockDetails02 {
    public static void main(String[] args) {
        A a = new A();  // getN1方法被调用  A静态代码块01
    }
}
class A{

    //无参构造器
    public A() {
        System.out.println("A构造器被调用");
    }

    //普通属性初始化
    private  int n2 = getN2();
    //普通代码块
    {
        System.out.println("A普通代码块01");
    }

    //静态属性初始化
    private static  int n1 = getN1();

    //静态代码块
    static {
        System.out.println("A静态代码块01");
    }




    public static int getN1() {
        System.out.println("静态getN1方法被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("普通getN2方法被调用");
        return 200;
    }
}
