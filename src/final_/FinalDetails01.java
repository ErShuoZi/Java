package final_;

/**
 *
 */
public class FinalDetails01 {
    public static void main(String[] args) {
        CC cc = new CC();

        EE ee = new EE();
        ee.cal();
    }
}
class AA {
    /**
     * 赋值阶段
     * 1.定义时:如 public final double TAX_RATE = 0.08;
     * 2在构造器中
     * 3.在代码块中
     *
     * 如果final修饰的属性是静态的,则初始化的位置只能是:1.定义时 2.静态代码块,  不能再构造器中赋值
     */
    public final double TAX_RATE = 0.08;
//    public final double TAX_RATE2;  //error

    public final double TAX_RATE3;

    public AA() {
        TAX_RATE3 = 1.1; //correct
    }
    public final double TAX_RATE4;

     {
        TAX_RATE4 = 2.2; //correct
    }
}


class BB{
//    如果final修饰的属性是静态的,则初始化的位置只能是:1.定义时 2.静态代码块,  不能再构造器中赋值

//    public static final double TAX_RATE3  = 10;// correct
    public static final double TAX_RATE3;
    static  {
        TAX_RATE3 = 10; //correct
    }

}

//final类不能被继承,但是可以实例化对象
final class CC{

}

//如果类不是final类,但是含有final方法,则该方法不能被重写,但是可以被继承
class DD {
  final public void cal (){
        System.out.println("cal方法");
    }
}

class EE extends DD {

}