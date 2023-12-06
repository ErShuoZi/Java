package enum_;

/**
 * @author liushuo
 * @version 1.0
 */
public class EnumerationExercise01 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week value : values) {
            System.out.println(value);
        }
    }
}

enum Week {

    MONDAY("星期一"),TUESDAY("星期二"),WESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五");

    private final String day;

    Week(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return day ;
    }
}
