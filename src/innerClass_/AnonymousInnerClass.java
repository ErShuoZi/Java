package innerClass_;

/**
 * 匿名内部类
 * 说明:匿名内部类是定义在外部类的局部位置,比如方法中,并且没有类名
 * 1.本质是类
 * 2.内部类
 * 3.该类没有名字
 * 4.同时还是一个对象
 * 语法:
 * new 类或接口(参数列表) {
 *     类体
 * }
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04{
    private int n1 = 10;
    public void method() {
        //基于接口的匿名内部类
        /**
         * 1.需求:想使用接口IA,并创建对象
         * 2.传统方式就是创建一个类,实现该接口,并创建对象
         * 3.希望Tigger类只是使用一次,以后再也不会使用,可以使用匿名内部类
         */

        //传统方式
//        IA tigger = new Tigger();
//        tigger.cry();

        //匿名内部类方式
        /**
         * Tigger的编译类型是IA
         * Tigger的运行类型是这个匿名内部类
         * 底层匿名内部类是:   xxx -> Outer04$1xxx
         *  class Outer04$1xxx implement IA {
         *        @Override
         *             public void cry() {
         *                 System.out.println("老虎叫 ");
         *             }
         *  }
         *
         *  jdk底层在创建了匿名内部类后立刻创建了Outer04$1xxx的实例,并且把地址返回给Tigger
         *  匿名内部类使用一次就不可以再次使用了
         */
        IA Tigger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫 ");
            }
        };
        System.out.println("tigger的运行类型=" + Tigger.getClass());  //class innerClass_.Outer04$1


        //演示基于类的匿名内部类
        /**
         * father的编译类型是Father
         * father的运行类型是Outer04$2
         * 底层会创建匿名内部类
         * class Outer04$2 extends Father{
         *       @Override
         *             public void test() {
         *                 System.out.println("匿名内部类重写了test方法");
         *             }
         * }
         *
         * 同时也返回了匿名内部类对象
         */
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        father.test();
        System.out.println("father的运行类型=" + father.getClass());  //class innerClass_.Outer04$2
    }
}


//class Tigger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("老虎叫");
//    }
//}
interface IA{
    public void cry();
}

class Father{
    private String name;
    public Father(String name) {
    this.name = name;
    }
    public void test(){

    }
}