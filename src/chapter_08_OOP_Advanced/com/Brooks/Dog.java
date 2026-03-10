package chapter_08_OOP_Advanced.com.Brooks;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 11:51
 */
public class Dog {
    String name;
    int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
