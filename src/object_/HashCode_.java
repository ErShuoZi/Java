package object_;

/**
 * HashCode提高具有Hash结构的容器的效率
 * 两个引用,如果指向的是同一个对象,则Hash值肯定是相同的
 * 两个引用,如果指向的是不是同一个对象,则Hash值肯定是不同的
 * Hash值主要是根据地址号而来,不能完全的将Hash值等价于地址
 */
public class HashCode_ {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();
        AA aa3 = aa1;
        System.out.println("aa1.hashCode()=" + aa1.hashCode()); //1808253012
        System.out.println("aa2.hashCode()=" + aa2.hashCode()); //589431969

        System.out.println("aa3.hashCode()=" + aa3.hashCode()); //1808253012
    }
}
class AA{

}
