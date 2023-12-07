package collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushuo
 * @version 1.0
 */
public class CollectionMethod {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);

//        Object removed = list.remove(0);
        boolean isDeletJjack = list.remove("jack");
        System.out.println(isDeletJjack);
//        System.out.println(removed);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list.addAll(list2);

        System.out.println(list);

        System.out.println(list.containsAll(list2));


        boolean isAll = list.removeAll(list2);
        System.out.println(isAll);
        list.add("王五");
        System.out.println(list);

    }
}
