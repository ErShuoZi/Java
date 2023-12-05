package Interface_;

public class Interface01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //Phone 实现了 UsbInterface 接口
        Phone phone = new Phone();
        computer.work(phone);
    }
}
