package innerClass_;

/**
 * 匿名内部类使用场景
 * 1.当做参数直接传递
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("匿名内部类的show");
            }
        });
    }

    public static void f1(IL params) {
        params.show();
    }
}

interface IL {
    public void show();
}



