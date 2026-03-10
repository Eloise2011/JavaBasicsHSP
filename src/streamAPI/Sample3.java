package streamAPI;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-09 21:11
 */

// 成员方法算不算西数?

public class Sample3 {

    static class Student {
        final String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static void main(String[] args) {
        Student s1 = new Student("张三");
        System.out.println(s1.getName());
        System.out.println(s1.getName());
        Student s2 = new Student("李四");
        System.out.println(s2.getName());
        System.out.println(s2.getName());
    }
}
