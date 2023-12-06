package innerClass_;

/**
 * 成员内部类
 * 1.可以直接访问外部类的所有成员
 * 2.可以添加任意访问修饰符.因为它本身就是一个成员
 * 3.作用域和其他类成员一样
 * 4.成员内部类访问外部类,可以直接访问
 * 5.外部类访问成员内部类,创建对象在访问
 * 6.外部其他类访问成员内部类:
 *      1.
 */
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.t1();

        //外部其他类使用成员内部类的三种方式:
        //1.外部类对象.new 内部类 :相当于把new Inner06当做outer06成员
        Outer06.Inner06 inner06 = outer06.new Inner06();


        //2.在外部类中,编写方法,可以返回Inner06的对象实例
        Outer06.Inner06 inner061 = outer06.getInner06();
        inner061.say();

        //3.new 外部类名().new 内部类名()
        Outer06.Inner06 inner062 = new Outer06().new Inner06();
        inner062.say();
    }
}



class Outer06 {
    private int n1 = 10;
    public String name = "张三";

    private void hi() {
        System.out.println("say方法");
    }
    class Inner06 { //成员内部类
        public void say() {
            System.out.println("outer06的n1 = " + n1 + "outer06的name = " + name);
            hi();

        }

    }

    public Inner06 getInner06() {
        return new Inner06();
    }

    //方法
    public void t1() {
        Inner06 inner06 = new Inner06();
        inner06.say();
    }
}




