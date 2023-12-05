package abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", 1, 2500);
        CommonEmployee worker = new CommonEmployee("李四", 2, 5000);
        manager.work();
        worker.work();

    }
}

