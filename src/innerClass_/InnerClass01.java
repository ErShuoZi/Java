package innerClass_;

public class InnerClass01 {  //外部其他类
    public static void main(String[] args) {

    }
}

class Outer { //外部类
    //类的五大组成:属性,方法,构造器,代码块,内部类
    //属性
    private int n1 = 100;

//    方法
    public void m1() {
        System.out.println("m1");
    }
    {
        //代码块
        System.out.println("代码块");
    }

    public Outer(int n1) { //构造器
        this.n1 = n1;
        System.out.println("构造器");
    }

    //内部类
    class Inner {

    }
}
