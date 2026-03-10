package chapter_08_OOP_Advanced.com.Josh;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 11:50
 */
public class Dog {
    String name;
    String color;

    public Dog() {
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
