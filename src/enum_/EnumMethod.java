package enum_;

/**
 * @author liushuo
 * @version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season2 fall = Season2.FALL;
        //输出枚举对象的名字
        System.out.println(fall.name());

        //ordinal()输出的是该枚举对象的次序,编号,从0开始
        System.out.println(fall.ordinal());
        // Season2.values()返回数组,该数组含有定义的所有对象
        Season2[] values = Season2.values();
        for (Season2 value : values) {  //增强for
            System.out.println(value);
        }

        //value of:将字符串转换成枚举对象,要求字符串必须为已有常量名,负责报异常
        Season2 Fall = Season2.valueOf("FALL");
        System.out.println(Fall + "-----");

        //CompareTo:比较两个枚举常量,比较的是编号
        /**
         *  public final int compareTo(E o) {
         *         return self.ordinal - other.ordinal;
         *     }
         */
        //结果 Season2.FALL 编号 -  Season2.SUMMER 编号
        System.out.println(Season2.FALL.compareTo(Season2.SUMMER));

    }

}
