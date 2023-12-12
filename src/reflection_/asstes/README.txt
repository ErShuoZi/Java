1.反射机制允许程序在执行期间借助与Reflection API取得任何类的内部信息(比如成员变量,构造器,成员方法等),并能操作对象的属性及方法,反射在设计模式和框架底层会使用
2.加载完类之后,在堆中就产生了一个Class类型的类对象(一个类只有一个类对象(Class)),这个对象包含了类的完整结构信息,通过这个对象得到类的结构,这个对象就像一面镜子,透过镜子看到类的结构,所以,形象的成为反射

Java反射机制可以完成
1.在运行时判断任意一个对象的所属的类
2.在运行时构造任意一个类的对象
3.在运行时得到任意一个类所具有的成员变量和方法
4.在运行时调用任意一个对象的成员变量和方法
5.生成动态代理


反射相关主要类:
1.java.lang.Class:代表一个类.Class对象表示某个类加载后在堆中的对象
2.java.lang.Reflect.Method:代表类的方法,Method对象表示某个类的方法
3.java.lang.Reflect.Field:代表类的成员变量,Field对象表示某个类的字段
4.java.lang.Reflect.Constructor:代表类的构造方法,Constructor对象表示构造器


反射调用优化-关闭访问检查
1.Method和Field,Constructor对象都有setAccessible()方法
2.setAccessible作用是启动和禁用访问安全检查开关
3.参数为true表示反射的对象在使用时取消访问检查,提高反射的效率,参数值为false则表示反射的对象执行访问检查

Class类:
1.Class类也是类,因此也继承Object
2.Class类对象不是new出来的,而是系统创建的
3.对于某个类的Class类对象,在内存中只有一份,因为类只加载一次
4.每个类的实例都会记录自己是由哪个Class类生成的
5.通过Class类可以完整的得到一个类的完整结构,通过一些列API
6.Class类对象是放在堆中的
7.类的字节二进制数据,是放在方法区的,有的地方称类的元数据


获取Class类对象的6种方式
不同阶段获取Class类对象的方式不同
1.代码编译阶段使用: Class.forName()
2.Class类加载阶段使用: 类.class()
3.Runtime阶段: 对象.getClass()
4.通过类加载器得到Class类对象
    public static void main(String[] args) throws ClassNotFoundException {
        //方式1.已知全类名,且该类在类路径下,可通过Class的静态方法forName()获取.应用场景:多用于配置文件,读取全类名,加载类
        //Class.forName()
        String classfullname = "reflection_.Cat";
        Class<?> cls1 = Class.forName(classfullname);
        System.out.println(cls1);
        //方式2.通过类名.class 应用场景:多用于参数传递,通过反射得到对应构造器对象
        Class<Cat> cls2 = Cat.class;
        System.out.println(cls2);

        //方式3.若已知具体的类的实例(对象),调用该实例的getClass方法获取
        Cat cat = new Cat();
        Class cls3 = cat.getClass();
        System.out.println(cls3);

        //4.通过类加载器(4种)获取到Class类对象
        //(1)先得到类加载器 cat
        ClassLoader classLoader = cat.getClass().getClassLoader();
        //(2)通过类加载器得到Class类对象
        Class<?> cls4 = classLoader.loadClass(classfullname);
        System.out.println(cls4);


        //cls1 - cl4 是同一个对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());


        //5.基本数据类型.class
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass); //int

        //6.基本数据类型对应包装类
        Class<Integer> integerClass1 = Integer.TYPE;
        System.out.println(integerClass1); //int

        System.out.println(integerClass.hashCode());
        System.out.println(integerClass1.hashCode());

    }