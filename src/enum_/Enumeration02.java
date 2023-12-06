package enum_;

/**
 * @author liushuo
 * @version 1.0
 */

/**
 * enum关键字实现枚举注意事项
 * 1.当使用enum关键字开发一个枚举类的时候,默认会继承Enum类
 * 2.传统的 public  static final Season2 SPRING =  new Season2("春天", "温暖");直接使用  SPRING("春天","温暖");
 * 被简化成SPRING("春天","温暖");
 * 3.如果使用无参构造器创建枚举对象,则实参列表和小括号都可以省略
 * 4.当有多个枚举对象时,使用,间隔
 * 5.枚举对象必须放在枚举类的行首
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.FALL);
    }
}


//使用enum关键字来实现枚举类
enum Season2{
    //如果使用enum来实现枚举类
    // 1.使用关键字enum替代class
    // public  static final Season2 SPRING =  new Season2("春天", "温暖");直接使用  SPRING("春天","温暖");
    //常量名(实参列表) 实参列跟构造器关联
    //如果有多个常量,使用,间隔即可
    //如果使用enum 来实现枚举,要求将定义常量对象写在最前面
    SPRING("春天","温暖"),
    WINTER("冬天","寒冷"),
    FALL("秋天","清爽"),
    SUMMER("夏天","炎热");
    private String name;
    private String desc;
//    public  static final Season2 SPRING =  new Season2("春天", "温暖");
//    public static final Season2 WINTER =  new Season2("冬天", "寒冷");
//    public static final Season2 SUMMER =  new Season2("夏天", "炎热");
//    public static final Season2 FALL =  new Season2("秋天", "清爽");

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    };


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
