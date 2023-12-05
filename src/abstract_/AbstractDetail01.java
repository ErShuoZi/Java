package abstract_;

/**
 * 1.抽象类不能被实例化
 * 2.抽象类不一定要包含抽象方法
 * 3.一旦包含了Abstract方法,则该类必须声明为Abstract
 * 4.Abstract只能修饰类和方法,不能修饰属性和其他
 */
public class AbstractDetail01 {
    public static void main(String[] args) {
//        1.抽象类不能被实例化
//        A a = new A(); //A' is abstract; cannot be instantiated

    }
}

//2.抽象类不一定要包含抽象方法,抽象类还可以有实现的方法.
abstract class A {
    public void hi() {
        System.out.println("hi");
    }
}

//3.一旦包含了Abstract方法,则该类必须声明为Abstract
abstract class B {
   abstract public void say();  //Abstract method in non-abstract class
}
