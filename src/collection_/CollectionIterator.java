package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author liushuo
 * @version 1.0
 */
public class CollectionIterator {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        /**
         * 1.Iterator对象成为迭代器,主要用于遍历Collection集合中的元素
         * 2.所有实现了Collection接口的集合类都有一个Iterator()方法,用以返回一个实现了Iterator接口的对象,即返回一个迭代器
         * 3.Iterator的结构图
         * 4.Iterator仅用于遍历集合,Iterator本身不存对象
         */

        Collection list = new ArrayList<>();
        list.add(new Book("三国演义","罗贯中",10.1));
        list.add(new Book("小李飞刀","古龙",5.1));
        list.add(new Book("红楼梦","曹雪芹",34.5));

        System.out.println(list);

        //希望遍历list
        //1.得到集合对应的迭代器
        Iterator iterator = list.iterator();
        //2.使用while循环遍历
//        while (iterator.hasNext()) { //判断是否还有数据
//            //返回下一个元素,类型是Object
//            Object next = iterator.next();
//            System.out.println(next.toString());
//
//        }

        //快捷键,快速生成while循环 itit
        //生成快捷模板的提示  cmd + j

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }

        //3.当退出while循环后,这时 Iterator迭代器指向最后一个元素
        //4.如果希望再次遍历,需要重置迭代器
        iterator = list.iterator();

    }


}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
