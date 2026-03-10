package chapter07_OOP;

/**
 * @author Joshua.H.Brooks
 * @description 简单来说，哪个对象调用this就指谁
 * @date 2025-12-10 23:25
 */
public class ThisDemo {
    public static void main(String[] args) {
        Pig pig = new Pig("八戒",100);
        System.out.println("Pig:"+pig.hashCode());
        T t = new T();
        System.out.println(t);
    }
}

class Pig{
    String name;
    int age ;
    public Pig(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("this: "+this.hashCode());
    }
}
class T{
    String name;
    int age;
    public T(){
        this("Bruce Lee",37);
        System.out.println("NoArgs constructor called");
    }

    public T(String name, int age) {
        System.out.println("AllArgs constructor called");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "T{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}