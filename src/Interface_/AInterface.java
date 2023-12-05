package Interface_;

/**
 * 在接口中抽象方法可以省略Abstract关键字
 * //在jdk8后可以有默认实现方法  default关键字
 * 在jdk8后可以有静态实现方法
 */
public interface AInterface {
    /**
     *属性,方法
     */
    public int n1 = 10;
    //抽象方法
    public void hi();

    //实现方法
    public default void ok() {
        System.out.println("ok...");
    }

    public static void cry() {
        System.out.println("cry...");
    }


}
