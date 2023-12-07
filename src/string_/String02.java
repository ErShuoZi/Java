package string_;

/**
 * @author liushuo
 * @version 1.0
 */

/**
 * 两种创建String对象的区别
 * 方式一:直接赋值String s = "ls";
 * 方式二:调用构造器 String s2 = new String("ls");
 *
 * 方式一:先从常量池查看是否有ls数据空间,如果有,直接指向;如果没有则重新创建,然后指向;ls 最终指向的是常量池的空间地址
 * 方式二:先在堆中创建空间.里面维护了char[] value 属性,指向常量池的ls的空间,如果常量池没有ls,重新创建,如果有,直接通过value指向
 * 最终指向的是堆中的空间地址
 */
public class String02 {
}
