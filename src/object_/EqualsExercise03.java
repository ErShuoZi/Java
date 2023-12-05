package object_;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相同" + (it == fl));//true. == 简单数据类型,比较值
        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和'A'是否相同" + (it == ch1));//true 字符的本质就是整数,比较的是两个字符,会转成整数.简单数据类型,比较值
        System.out.println("12和ch2是否相同" + (12 == ch2));//true 简单数据类型,比较值

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println("s1和s2是否相同" + (s1 == s2));//false == 复杂数据类型比较的是内存地址
        System.out.println("s1是否equals s2" + (s1.equals(s2)));//true String类有重写equals方法,比较的是值
//        System.out.println("hello" == new java.sql.Date()); //报错
    }
}
