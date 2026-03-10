package chapter07_OOP;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-10 10:05
 */
public class TestMemory {
    public static void main(String[] args) {
        System.out.println("======= 程序开始 =======");

        // 第一次使用Person类，触发类加载
        System.out.println("1. 第一次访问Person类静态变量：" + Person.species);

        // 调用静态方法，不会触发类加载（已加载）
        Person.showCount();

        System.out.println("\n2. 创建第一个对象：");
        Person p1 = new Person("张三", 20);
        p1.sayHello();

        System.out.println("\n3. 创建第二个对象：");
        Person p2 = new Person("李四", 25);
        p2.sayHello();

        Person.showCount();

        System.out.println("\n4. 对象引用变化：");
        p1 = p2; // 张三对象失去引用，等待回收
        System.gc(); // 建议垃圾回收（不一定立即执行）

        System.out.println("\n5. 局部变量作用域：");
        methodTest();

        System.out.println("\n======= 程序结束 =======");
    }

    public static void methodTest() {
        // 局部变量在方法栈中
        int localVar = 10;
        Person temp = new Person("临时", 30);
        System.out.println("方法内的局部对象创建了");
        // 方法结束，temp失去引用，等待回收
    }
}
