package innerClass_;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了~");
            }
        });

        phone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课啦");
            }
        });

    }
}

class Phone {
    public void clock(Bell bell){
        bell.ring();
    }
}
//interface Bell {
//    public void ring();
//}

//class Bell {
//    public void ring() {
//
//    }
//}


abstract class Bell {
    abstract public void ring() ;
}
