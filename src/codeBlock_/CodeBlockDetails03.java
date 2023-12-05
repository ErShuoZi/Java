package codeBlock_;

/**
 * 构造器的最前面其实是隐含了super()和调用普通配合代码块
 */
public class CodeBlockDetails03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();  //AAA 无参构造器被调用   BBB 普通代码块执行    BBB 无参构造器被调用
    }
}

class AAA{
    public AAA() {
        //隐藏的super
//        super();
        System.out.println("AAA 无参构造器被调用");
    }
}
class BBB extends AAA{



    //普通代码块
    {
        System.out.println("BBB 普通代码块执行");
    }
    public BBB() {
        //隐藏的super
        super();
        System.out.println("BBB 无参构造器被调用");
    }
}
