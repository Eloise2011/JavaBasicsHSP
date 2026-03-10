package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 16:39
 */
public class CodeBlockExec02 {
    public static void main(String[] args) {
        /**
         * 静态成员sam初始化
         * static块 执行
         * sam1 成员初始化
         * Test default constructor called
         */
        Test a = new Test();
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample default Constructor called");
    }
}

class Test {
    Sample sam1 = new Sample("sam1 成员初始化");
    static Sample sam = new Sample("静态成员sam初始化");

    static {
        System.out.println("static块执行");
        if (sam == null) {
            System.out.println("sam is null");
        }
    }

    Test() {
        // 隐藏了 super() & 本类普通代码块和普通属性
        System.out.println("Test default constructor called");
    }
}
