package innerClass_;

/**
 * 匿名内部类使用细节
 *
 */
public class AnonymousInnerClassDetails01 {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();

    }
}

class Outer05{
    final private int n1 = 100;
    public void f1() {
        //创建基于类的匿名内部类
        Person p = new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类的hi方法" + n1);
            }
        };
        p.hi(); //动态绑定  Outer05$1

        //也可以直接调用

        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法,哈哈哈");
            }

        }.hi();

        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法,哈哈哈");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
                System.out.println("匿名内部类接收到的参数" + str);
            }
        }.ok("ok方法的参数");

    }
}
class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person Ok()" + str);
    }
}

//
