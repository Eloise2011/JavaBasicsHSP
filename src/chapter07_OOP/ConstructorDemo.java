package chapter07_OOP;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-10 20:49
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
class Dog{
    String name;
    int age ;
    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
