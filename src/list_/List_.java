package list_;

/**
 * @author liushuo
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * List接口是Collection接口的子接口
 * 1.List集合类中元素有序,且可重复
 * 2.List集合中的每个元素都有其对应的顺序索引
 * 3.List容器中的每个元素都对应这一个整数型的序号记载其所在容器中的位置,可以根据序号存取容器中的元素
 */
public class List_ {

    @SuppressWarnings("all")
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("jerry");
        list.add("jack");
        System.out.println(list);
        //索引从0开始
        System.out.println(list.get(3));

    }
}
