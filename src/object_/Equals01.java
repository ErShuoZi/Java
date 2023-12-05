package object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c); //true
        System.out.println(b == c); //true

        B obj = a;
        System.out.println(obj == c);

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2); //基本数据类型,判断值是否相等


        "hello".equals("abc");


        /**
         * public boolean equals(Object anObject) {
         *         if (this == anObject) {
         *             return true;
         *         }
         *         if (anObject instanceof String) {
         *             String anotherString = (String)anObject;
         *             int n = value.length;
         *             if (n == anotherString.value.length) {
         *                 char v1[] = value;
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 while (n-- != 0) {
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;
         *             }
         *         }
         *         return false;
         *     }
         */

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2); //false
        System.out.println(integer1.equals(integer2)); //true



    }
}
class A extends B  {

}
class B{}


