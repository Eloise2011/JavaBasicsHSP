package chapter_08_OOP_Advanced._polyMorphism._polyArray;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-30 22:27
 */
public class Student extends Person{
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say(){
        return super.say() + ", score = " + score;
    }
}
