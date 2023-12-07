package string_;

/**
 * @author liushuo
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        /**
         * 1.String 对象用于保存字符串,也是一组字符序列
         * 2.字符串的字符使用Unicode字符编码,一个字符不区分字母还是汉字  占两个字节
         * 3.String有很多构造器,构造器的重载
         * 常用的String构造器有
         *  String s1 = new String();
         *  String s2 = new String(String original)
         *  String s3 = new String(char[] a)
         *  String s4 = new String(char[]a,int startIndex,int count)
         *  String s5 = new String(byte)
         *
         *  String类实现了Serializable接口 [String可以串行化:可以在网络传输的]
         *   String类实现了Comparable接口 [String 对象可以比较大小]
         *   String 类是Final类
         *   String中有属性    private final char value[]; 用于存放字符串内容
         *   注意: final char value[] 是final类型的,一旦被赋值,不可修改
         */

        String name = "jack";
    }
}
