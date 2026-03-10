package chapter07_OOP;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-10 10:03
 */
// 文件：Person.java
public class Person {
    // 1. 静态变量 - 类加载时初始化
    static String species = "人类";
    static int count = 0;

    // 2. 静态代码块 - 类加载时执行（只执行一次）
    static {
        System.out.println("Person类被加载到内存，物种：" + species);
        count = 100; // 初始化静态变量
    }

    // 3. 实例变量
    String name;
    int age;

    // 4. 实例代码块 - 每次创建对象时执行（在构造方法之前）
    {
        System.out.println("准备创建Person对象...");
        count++; // 统计创建了多少个对象
    }

    // 5. 构造方法
    public Person(String name, int age) {
        System.out.println("Person构造方法执行");
        this.name = name;
        this.age = age;
    }

    // 6. 实例方法
    public void sayHello() {
        System.out.println(name + "说：你好！");
    }

    // 7. 静态方法
    public static void showCount() {
        System.out.println("已创建" + count + "个Person对象");
    }

    // 8. finalize方法 - 对象被垃圾回收时调用（不推荐依赖）
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "对象被回收了");
        super.finalize();
    }
}