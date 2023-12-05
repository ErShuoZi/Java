package Interface_;

public class Interface02 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}

//需要将接口的所有抽象方法实现
class A implements AInterface{
    @Override
    public void hi() {
        System.out.println("hi....");
    }
}
