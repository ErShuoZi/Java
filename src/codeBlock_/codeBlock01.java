package codeBlock_;

public class codeBlock01 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("星际穿越");
        Movie movie2 = new Movie("大话西游");
        Movie movie3 = new Movie("盗梦空间");

    }

}

class Movie {

    /**
     * 三个构造器都有相同的语句,可以使用代码块
     * 使用代码块可以不管使用哪个构造器创建对象,都会先调用代码块的内容
     * 代码块的调用顺序优先于构造器
     */

    static {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
    }
    private String name;
    private double price;
    private String director;



    public Movie(String name) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
