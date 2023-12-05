package Interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        C_ c = new C_();
        c.pX();

    }
}
interface A_{
    int x = 0;
    //public static final int x = 0;
}
class B_ {
    int x = 1;
}

class C_ extends B_ implements A_ {
    public void pX() {
//        System.out.println(x);  //error 不明确x是谁的 接口的? 还是父类的?

        //可以明确的指定x
        System.out.println(A_.x);//接口x
        System.out.println(super.x); //父类x;
    }

}


