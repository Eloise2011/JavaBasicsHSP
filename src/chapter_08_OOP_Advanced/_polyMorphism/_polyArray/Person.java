package chapter_08_OOP_Advanced._polyMorphism._polyArray;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-30 22:26
 */
public class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){
        return "name = " + name+", age = " + age;
    }
}
