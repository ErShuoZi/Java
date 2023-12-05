package final_;


/**
 * final关键字使用场景
 * 1.当不希望类被继承时
 * 2.当不希望父类的某个方法被子类重写时
 * 3.当不希望类的属性的值被修改时
 * 4.当不希望某个局部变量被修改时
 */
public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.TAX_RATE = 10;

    }
}

//如果希望A类不能被其他类继承,此时可以是用final 修饰 A类即可
final class A{}
//class B extends A{
//
//}

class C {
    //如果使用final关键字修饰方法,那么该方法不能被子类重写
    final public void hi() {

    }
}

class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi方法");
//    }
}


//当不希望类的属性的值被修改时
class E {
   final public double TAX_RATE = 0.08;

}

//当不希望某个局部变量被修改时
class F {
    public void cry() {
        final double NUM = 0.01;
//        NUM = 0.09;
    }
}
