package chapter07_OOP;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-10 17:12
 */
public class OverLoadDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
    }
    public static int test1(int a,int b){
        return a+b;
    }
    //会报编译错误： test1(int,int) is already defined in class OverLoadDemo

//    public static String test1(int a, int b){
//        return String.valueOf(a).concat(String.valueOf(b));
//    }
}
class Cat{
    String name;
    int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
