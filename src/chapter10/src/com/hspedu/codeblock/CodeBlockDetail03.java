package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 15:18
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        /** 控制台输出：
         * AAA 普通代码块
         * AAA() 构造器
         * BBB 普通代码块
         * BBB() 构造器
         */
        new BBB();
    }
}

class AAA{
    {
        System.out.println("AAA 普通代码块");
    }
    public AAA() {
        // 这里隐藏了：1. super() 和 2. 本类的代码块； 因为AAA的父类是Object没有输出，所以在console没有体现
        System.out.println("AAA() 构造器");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB 普通代码块");
    }

    public BBB() {
        // 这里隐藏了：1. super() 和 2. 本类的代码块
        System.out.println("BBB() 构造器");
    }
}
