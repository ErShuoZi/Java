package object_;

/**
 * 当对象被回收时.系统自动调用该对象(Object)的Finalize方法,子类可以重写方法,做一些释放资源的操作
 * 什么时候被回收:当某个对象没有任何引用时,则jvm就认为该对象是垃圾,就会使用垃圾回收机制进行回收,在销毁对象前,会调用Finalize方法
 * 垃圾回收机制的调用,是由系统决定,也可以通过System.gc()主动出发垃圾回收机制
 */
public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;

        System.gc();
        System.out.println("程序退出了");
    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
        System.out.println("释放了某些资源");
    }
}
