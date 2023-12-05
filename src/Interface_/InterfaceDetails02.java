package Interface_;

/**
 *
 * 一个类中可以同时实现多个接口,但不可以继承多个类
 * 接口中的属性,只能是final的,而且是public static final修饰符,比如 int a = 1,实际上是public static final int a = 1,必须初始化
 * 接口中的属性的访问形式,接口名.属性名
 * 一个接口不能继承其他类,但是可以继承多个其他的接口
 * 接口的修饰符,只能是public和默认,这点和抽象类是一致的
 */
public class InterfaceDetails02 {
    public static void main(String[] args) {
        //证明接口中的属性都是public static final
        //如果不是静态属性的话,是不可以用类(接口名).属性名的方式访问
        System.out.println(IB.n1);
//        IB.n1=20 // Cannot assign a value to final variable 'n1' 说明n1 是final

    }
}

interface IB {
    int n1 = 10; //等价于 public static final int n1 = 10
    void hi();
}
interface IC {
    void cry();
}
class Pig implements IB,IC{
    @Override
    public void hi() {

    }

    @Override
    public void cry() {

    }
}
interface ID extends IB,IC {

}
