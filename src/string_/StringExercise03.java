package string_;

/**
 * @author liushuo
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {

//         String s1 = "haha"; 是在常量池中     new String 是在堆中,地址不同
        String s1 = "haha";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = "java";
        System.out.println(s2 == s3);// false
        System.out.println(s2 == s4); //true
        System.out.println(s2.equals(s3)); //true
        System.out.println(s1 == s2); //true
    }
}
