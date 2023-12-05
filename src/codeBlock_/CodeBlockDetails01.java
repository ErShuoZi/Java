package codeBlock_;

/**
 *
 * static是静态代码块,作用是对类进行初始化,而且随着类的加载而执行,并且只会执行一次,如果是普通代码块,每次创建一个对象,就会执行一次
 */
public class CodeBlockDetails01 {
    public static void main(String[] args) {
        //创建对象实例时
//        AA aa = new AA();  //静态代码块会被执行 -> AA的静态代码块1被执行了

        //创建子类对象实例的时候,父类也会被加载,而且父类的加载顺序优先于子类
        AA aa2 = new AA(); //BB的静态代码块1被执行了   AA的静态代码块1被执行了

        //使用类的静态成员时(静态属性,静态方法)也会导致该类被加载(只会执行静态代码块,而不会执行普通代码块,普通代码块只会在创建对象的时候会被调用)
        System.out.println(Cat.n1);  //cat的静态代码块被执行  999

        //静态代码块只会被执行一次
//        DD dd1 = new DD();
//        DD dd2 = new DD();

        //如果只是调用类的静态成员时.不会调用普通代码块,普通代码块只会在创建对象的时候会被调用

        //可以简单理解为 普通代码块是构造器的补充,构造器被调用,普通代码块就会调用
        System.out.println(DD.n1);


    }
}

class DD{
    //静态属性
    public static int n1 = 888;
//    static {
//        System.out.println("DD的静态代码块被执行");
//    }
    {
        System.out.println("DD的普通代码块被执行");
    }
}

class Animal{
    static {
        System.out.println("Animal静态代码块被执行");
    }
}


class Cat  extends Animal{
    public static int n1 = 999;  //静态属性
    static  {
        System.out.println("cat的静态代码块被执行");
    }
}

class BB{
    static  {
        System.out.println("BB的静态代码块1被执行了");
    }
}

class AA extends BB{
    //静态代码块
    static  {
        System.out.println("AA的静态代码块1被执行了");
    }
}

