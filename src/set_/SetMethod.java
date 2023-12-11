package set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liushuo
 * @version 1.0
 */

/**
 * Set接口的实现类的对象(Set接口对象) 不能存放重复元素,存取顺序是无序的(即添加顺序和取出顺序不一致)
 * Set接口对象无法没有索引,无法使用普通for遍历
 */
public class SetMethod {
    public static void main(String[] args) {
        //以Set接口的实现类 HashSet作为示例
        Set set = new HashSet();
        set.add("jack");
        set.add("lucy");
        set.add("john");
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
