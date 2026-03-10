package chapter_08_OOP_Advanced._polyMorphism._polyArray;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-30 22:27
 */
public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + ", salary = " + salary;
    }

}
