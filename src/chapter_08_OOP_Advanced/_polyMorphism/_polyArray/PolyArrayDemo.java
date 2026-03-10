package chapter_08_OOP_Advanced._polyMorphism._polyArray;

import java.util.Arrays;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-30 22:32
 */
public class PolyArrayDemo {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        persons[0] = new Person("Jack", 20);
        persons[1] = new Student("Jack", 18,100);
        persons[2] = new Student("smith", 19,200);
        persons[3] = new Teacher("scott", 30,20000);
        persons[4] = new Teacher("King", 50,50000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
        }
    }
}
