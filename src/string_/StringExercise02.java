package string_;

/**
 * @author liushuo
 * @version 1.0
 */
public class StringExercise02 {
    public static void main(String[] args) {
        String a = "ls"; //直接存在常量区
        String b = new String("ls"); //存在堆中的value属性中,再由value属性指向常量区.所以指向和a 是不同的
        System.out.println(a.equals(b)); //true
        System.out.println(a == b); // ; false

        //intern:最终返回的是常量池的地址(对象)
        System.out.println(a == b.intern()); //true
        System.out.println(b == b.intern()); //false
    }
}
