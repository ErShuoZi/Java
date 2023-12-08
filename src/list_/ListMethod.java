package list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushuo
 * @version 1.0
 */
public class ListMethod {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList<>();
        //插入
        list.add("张三");
        list.add("李四");
        list.add("王五");

        list.add(0,"被插入到第一个位置的");
        System.out.println(list);


        List list2 = new ArrayList<>();
        list2.add("tom");
        list2.add("jack");

        list.addAll(list2);
//        list2.addAll(int index,Collection e)
        System.out.println(list);

        System.out.println(list.indexOf("张三"));

//        list.remove()
//        Object set(int index,Object ele):设置指定index位置的元素为ele,相当于是替换
        list.set(0,"替换掉元素");
        System.out.println(list);

        //subList:返回从指定fromIndex 到toIndex位置的子集合  左闭右开
        List list3 = list.subList(0, 2);
        System.out.println(list3);
    }
}
