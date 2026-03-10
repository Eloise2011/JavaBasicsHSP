package streamAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joshua.H.Brooks
 * @description 函数对象的好处1: 行为对象化
 * @date 2025-12-09 21:31
 */
public class Sample06 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("张无忌", 18, "男"),
                new Student("杨不悔", 19, "女"),
                new Student("周芷若", 20, "女"),
                new Student("宋青书", 21, "男")
                );

        System.out.println(filter(students));
        System.out.println(filter(students, (student) -> student.age > 18));
        System.out.println(filter(students, (student) -> student.sex.equals("男")));
    }



    static class Student {
        private String name;
        private int age;
        private String sex;


        public Student() {
        }

        public Student(String name, int age, String sex) {
            super();
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    '}';
        }
    }
    interface Lambda{
        boolean test(Student student);
    }
    static List<Student> filter(List<Student> students, Lambda lambda){
        List<Student> studentList = new ArrayList<>();
        for(Student student:students){
            if(lambda.test(student)){
                studentList.add(student);
            }
        }
        return studentList;

    }


    static List<Student> filter(List<Student> students){
        List<Student> result = new ArrayList<>();
        for(Student student:students){
            if(student.sex.equals("男")){
                result.add(student);
            }
        }
        return result;

    }


}
