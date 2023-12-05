package Interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if01 = new Monster();
        //接口的多态体现
        //接口类型的引用,可是指向实现类的实例对象
        if01 = new Car();
    }
}

interface IF {}

class Monster implements IF{}
class Car implements IF{}
