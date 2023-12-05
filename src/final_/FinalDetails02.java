package final_;

/**
 * 如果一个类已经是final类了,就没有必要在将方法修饰成final方法了
 * final不能修饰构造器
 * final 往往和 static搭配使用,使用效率高,底层编译器做了优化处理
 *
 */
public class FinalDetails02 {
    public static void main(String[] args) {

    }
}

final class AAA {
    public  void cry() {

    }
}
