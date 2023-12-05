package Interface_;

/**
 * 多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口多态
        //接口类型引用指向接口实现类的实例对象
        IG ig = new Teacher();
        // error  Teacher 没有实现 IH接口
        // IH iH = new Teacher();
        //如果IG接口继承了IH接口 就被传递过来了  这就是多态传递现象,等于给接口添加一个父接口,让爷爷类型的接口引用指向实现类的实力对象是可以的
        //如果IG接口继承了IH接口,实际上相当于 Teacher类也实现了IH接口
        IH iH = new Teacher();

    }
}

interface IH {
    public void hy();

}
interface  IG extends IH {}

class Teacher  implements IG {
    @Override
    public void hy() {

    }
}