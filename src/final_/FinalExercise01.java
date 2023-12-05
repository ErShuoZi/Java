package final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double v = circle.calArea();
        System.out.println(v);
    }
}

class Circle {
    private double radius;
    // = 3.14
    private final double PI;


    {
        PI = 3.14;
    }

    //构造器
    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14;
    }

    public double calArea() {
        return PI * radius * radius;
    }
}
