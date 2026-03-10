package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 10:47
 */
public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好,李焕英");
        Movie movie2 = new Movie("摔跤吧爸爸",29);
        Movie movie3 = new Movie("唐探3",35,"陈思成");
    }
}
class Movie{
    /**
     * 三个构造器钟都有三条相同的语句，比较冗余，这时我们可以把相同的语句放到一个代码块。
     * 当我们不管调用哪个构造器创建对象，都会先调用代码块， 即 代码块优先于构造器执行
     *
     * 可以看作是另外一种形式的构造器，（对构造器的补充机制）可以做初始化操作
     * 场景： 当多个构造器中有重复的语句，就可以使用代码块提取重复语句
     */
    {
        System.out.println("电影屏幕打开了");
        System.out.println("广告开始了");
        System.out.println("电影正式开始");
    }
    private String name;
    private double price;
    private String director;

    public Movie(String name) {
//        System.out.println("电影屏幕打开了");
//        System.out.println("广告开始了");
//        System.out.println("电影正式开始");
        this.name = name;
        System.out.println("1 号构造器被调用");
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开了");
//        System.out.println("广告开始了");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
        System.out.println("2 号构造器被调用");
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开了");
//        System.out.println("广告开始了");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("3 号构造器被调用");
    }
}
