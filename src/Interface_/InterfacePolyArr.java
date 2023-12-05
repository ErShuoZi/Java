package Interface_;

/**
 * 多态数组
 */
public class InterfacePolyArr {
    public static void main(String[] args) {

        //多态数组
        Usb[] usbs = new Usb[2];

        usbs[0] = new Phone_();
        usbs[1] = new Camera_();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            //向下转型,转为具体的手机
            if(usbs[i] instanceof Phone_) {  //判断运行类型是不是Phone_
                ((Phone_) usbs[i]).call();
            }

        }

    }
}

interface Usb{
    public void work();
}
class Phone_ implements Usb{
    @Override
    public void work() {
        System.out.println("手机工作中");
    }

    public void call() {
        System.out.println("手机可以打电话");
    }
}
class Camera_ implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}
