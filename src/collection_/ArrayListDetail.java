package collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushuo
 * @version 1.0
 */

/**
 * ArrayList是由数组实现
 * ArrayList基本等同于Vector.除了ArrayList是线程不安全,但是执行效率好
 */
public class ArrayListDetail {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("");
        list.add(null);
        list.add("jacl");
        System.out.println(list);
        list.add(null);
        System.out.println(list);
    }
}
