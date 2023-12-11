package map_;

/**
 * @author liushuo
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map接口实现类的特点:
 * 1.Map用于保存具有映射关系的数据
 * 2.Map中的key和value可以是任意引用类型的数据,会封装到HashMap$Node对象中
 * 3.Map中的key不允许重复
 * 4.Map中的value可以重复
 * 5.Map的key可以为null,value也可以为null,注意key为null,只能存在一个
 * 6.常用String类作为Map的key
 * 7.Key和value之间存在单向一对一关系,即通过指定的key总能找到对象的value
 */
public class Map_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //双列元素
        Map map = new HashMap();
        map.put("no1","张三");
        map.put("no2","李四");
        map.put("no3","王五");

        System.out.println(map);

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object entry : set) {
            System.out.println(entry);
        }

    }
}
