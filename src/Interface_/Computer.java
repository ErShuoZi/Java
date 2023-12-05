package Interface_;

public class Computer{

    //编写一个方法
    //UsbInterface usbInterface形参是接口类型 UsbInterface
    //只要是实现了UsbInterface接口的对象实例,都可以作为形参传递到work方法中
    public void work(UsbInterface usbInterface) {
        //通过接口调用方法
        usbInterface.start();
        usbInterface.stop();

    }

}
