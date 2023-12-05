package Interface_;

public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("OracleDB 连接");
    }

    @Override
    public void close() {
        System.out.println("OracleDB 关闭");
    }
}
