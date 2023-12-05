package abstract_;

public class Abstract01 {
    public static void main(String[] args) {
        Dog xiaohua = new Dog("小花");
        xiaohua.eat();
    }
}

abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //这里的eat方法没有意义
    //父类方法不确定性的问题
    //==>考虑将该方法设计为抽象方法,让子类去重写实现
    //==>当类中存在抽象方法,那么该类声明为abstract类
    //抽象类会被继承,由子类实现抽象方法
//    public void eat() {
//        System.out.println("这是一个动物,但是不知道吃什么");
//    }

     public abstract void eat();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}