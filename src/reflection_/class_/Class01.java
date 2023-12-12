package reflection_.class_;

import reflection_.Cat;

/**
 * @author liushuo
 * @version 1.0
 * 对Class类特点梳理
 */
public class Class01 {
    public static void main(String[] args) throws Exception {
        //Class类对象是系统创建的
        //传统对象
        /**
         * ClassLoader类
         *    public Class<?> loadClass(String name) throws ClassNotFoundException {
         *         return loadClass(name, false);
         *     }
         */
//        Cat cat = new Cat();

        //反射的方式
        Class<?> aClass = Class.forName("reflection_.Cat");

    }
}
