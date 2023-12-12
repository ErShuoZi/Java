package reflection_;

/**
 * @author liushuo
 * @version 1.0
 */
public class Cat {
    private String name = "招财猫";
    public int age = 10;

    public void hi() {
//        System.out.println("hi" + name);
    }

    public void cry() {
        System.out.println(name + "喵喵咪~");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
