package enum_;

/**
 * @author liushuo
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
//        Season spring = new Season("春天", "温暖");
//        Season winter = new Season("冬天", "寒冷");
//        Season summer = new Season("夏天", "炎热");
//        Season Fall = new Season("秋天", "清爽");

        System.out.println(Season.SUMMER);
    }
}

//自定义枚举类实现
//1.将构造器私有化.防治直接被new
//2.去除set方法,防止属性被修改
//3.在该类内部直接创建固定的对象
//4.优化:可以在加入final修饰符
class Season{
    final private String name;
    final private String desc;

    public  static final Season SPRING =  new Season("春天", "温暖");
    public static final Season WINTER =  new Season("冬天", "寒冷");
    public static final Season SUMMER =  new Season("夏天", "炎热");
    public static final Season FALL =  new Season("秋天", "清爽");


    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
