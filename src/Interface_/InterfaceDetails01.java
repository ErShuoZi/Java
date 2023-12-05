package Interface_;

public class InterfaceDetails01 {
    public static void main(String[] args) {

    }
}


/***
 * 1.接口不能被实例化
 * 2.接口中所有方法都是public方法,接口中抽象方法,可以不用Abstract修饰
 * 3.一个普通类实现接口,就必须将该接口的所有抽象方法都实现
 * 4.抽象类实现接口.可以不用实现接口的方法
 */

interface IA {
    public abstract void say();
    void hi();
}

class Cat implements IA{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tigger implements IA{}