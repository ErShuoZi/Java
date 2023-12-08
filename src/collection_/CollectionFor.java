package collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author liushuo
 * @version 1.0
 */

@SuppressWarnings("all")
public class CollectionFor {
    public static void main(String[] args) {
        Collection list = new ArrayList<>();
        list.add(new Book_("三国演义","罗贯中",10.1));
        list.add(new Book_("小李飞刀","古龙",5.1));
        list.add(new Book_("红楼梦","曹雪芹",34.5));
        //使用增强for   增强for也可以直接在数组上使用
        for (Object book : list) {
            System.out.println("book="+ book);
        }

        int[] nums = {1,5,7,8};
        for (int num : nums) {
            System.out.println(num);
        }

    }
}


class Book_ {
    private String name;
    private String author;
    private double price;

    public Book_(String name, String author, double price) {
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