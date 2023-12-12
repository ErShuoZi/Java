package reflection_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author liushuo
 * @version 1.0
 */
public class Reflection01 {



    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src/re.properties"));

        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        Class<?> aClass = Class.forName(classfullpath);
        Object o = aClass.newInstance();
        Method method1 = aClass.getMethod(methodName);
        method1.invoke(o);

        //得到name字段
        //getField不能获取私有化的属性
        Field ageField = aClass.getField("age");
        //age :public int reflection_.Cat.age
        System.out.println(ageField.get(o));  //10 传统写法:对象.成员变量  反射:成员变量对象.get(对象)

        //得到构造器
        //传入构造器参数类型,如果为空,那么将得到无参构造器
        Constructor<?> constructor = aClass.getConstructor();
        System.out.println(constructor);  //public reflection_.Cat()

        //如果想得到带参数的构造器
        Constructor<?> constructorWithParmas = aClass.getConstructor(String.class, int.class);
        System.out.println(constructorWithParmas);  //public reflection_.Cat(java.lang.String,int)

        Object o1 = constructorWithParmas.newInstance("小花", 20);
        System.out.println(o1);
        Class<?> aClass1 = o1.getClass();
        Field age = aClass1.getField("age");
        System.out.println(age.get(o1));


    }
}
