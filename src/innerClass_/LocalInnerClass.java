package innerClass_;

/**
 * 局部内部类
 * 说明:
 * 局部内部类是定义在外部类的局部位置,比如方法中,并且该内部类具有类名
 * 特点:
 * 1.可以直接访问外部类的所有属性,包括私有属性
 * 2.不能添加访问修饰符.因为它的地位就是一个局部变量,局部变量不可以使用修饰符,但是可以使用final修饰符,因为局部变量可以使用final
 * 3.作用域:仅仅在定义它的方法或代码块中
 * 4.局部内部类访问外部的成员的访问方式是直接访问
 * 5.外部类访问局部内部类的成员的方式是创建局部内部类对象,在访问
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02 {
    private int n1 = 100;
    //私有方法
    private void m2() {
        System.out.println("m2被调用");
    }
     public void m1() {
        //局部内部类是定义在外部类的局部位置,通常在方法中
       final class Inner02 { //局部内部类
           private int n1 = 900;
            //可以直接访问外部类的所有成员
            public void f1() {
                //如果外部类和内部类重名,遵守就近原则,如果想访问外部类的成员,可以使用外部类名.this.成员的方式
                //Outer02.this本质是外部类对象
                System.out.println(Outer02.this.n1);
                System.out.println("n1=" + Outer02.this.n1);
                m2();
            }
        }
        //被final修饰的类不能被继承
//        class Inner03 extends Inner02{
//
//        }
         //外部类只能通过创建局部内部类对象的方式使用局部内部类的属性
         Inner02 inner02 = new Inner02();
         inner02.f1();


     }
    //代码块
    {
        class Inner03 {

        }
    }

}
