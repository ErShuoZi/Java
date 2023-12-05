package object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        Person2 person2 = new Person2();
        person1.name="jake";
        person2.name = "jake";

        System.out.println(person1 == person2); //false
        System.out.println(person1.name.equals(person2.name)); //true.字符串重写了equals方法,比较值是否相同
        System.out.println(person1.equals(person2));//false.Person2类没有重写equals方法,默认是使用Object的equals方法,比较内存地址是否相同

        String str1 = new String("asdf");
        String str2 = new String("asdf");

        System.out.println(str1.equals(str2));// true.String类重写了equals方法,比较值是否相同
        System.out.println(str1 == str2);//false  == 如果是基本数据类型,比较值.如果是复杂数据类型,比较内存地址,字符串是复杂数据类型




    }
}

class Person2 {
    public String name;

}
