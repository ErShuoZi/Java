package reflection_.class_;

import reflection_.Cat;

import java.lang.reflect.Field;

/**
 * @author liushuo
 * @version 1.0
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classfullpath = "reflection_.Cat";
        /**
         * 1.获取到Cat类 对应的Class类对象
         * Class<?>表示不确定的Java类型
         */
        Class<?> aClass = Class.forName(classfullpath);
        //2.输出aClass
        System.out.println(aClass); //得到的是哪个类的Class类对象,class reflection_.Cat
        System.out.println(aClass.getClass()); //输出的是aClass的运行类型.java.lang.Class

        //3.得到包名
        System.out.println(aClass.getPackage().getName()); //reflection_
        //4.得到全类名
        System.out.println(aClass.getName()); //reflection_.Cat
        //5.通过aClass创建对象实例
        Cat o = (Cat) aClass.newInstance();
        System.out.println(o); //reflection_.Cat@6bc7c054  重写toString后 Cat{name='招财猫', age=10}


        //6.通过反射获取属性
        Field ageField = aClass.getField("age");
        System.out.println(ageField.get(o)); //10

        //7.通过反射给属性赋值
        ageField.set(o,100);
        System.out.println(ageField.get(o)); //100

        //8.希望可以获取到所有字段属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

    }
}
