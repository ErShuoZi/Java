package abstract_;

/**
 * 抽象类可以有任意成员[抽象类的本质还是类],比如:非抽象方法,构造器,静态属性等等
 * 抽象方法不能有方法主体
 * 如果一个类继承了抽象类,则它必须实现所有的抽象方法,除非它自己也声明为一个抽象类
 * 抽象方法不能使用private final 和static来修饰,因为这些修饰符与子类重写冲突
 */
public class AbstractDetails02 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

abstract class D {
    public int n1 = 10;
    public static String name = "张三";

    public void hi(){
        System.out.println("hi");
    }
    public abstract void Hello();

    public static void Eat() {
        System.out.println("eat");
    }
}


abstract class E {
    //抽象方法
    public abstract  void Hi();
}

class F extends E {

    @Override
    public void Hi() {

    }
}
