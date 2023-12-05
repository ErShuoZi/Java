package Interface_;

public class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("链接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
