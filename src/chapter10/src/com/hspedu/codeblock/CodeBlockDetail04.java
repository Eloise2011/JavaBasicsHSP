package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 15:46
 */

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        /**
         * 先类加载： 先加载GrandFather，再加载Father，最后加载Son
         * 再创建对象实例：
         * 控制台输出：
         * 1. GrandFather static block
         * 2. Father static block
         * 3. Son static block
         * 4. GrandFather 普通代码块
         * 5. GrandFather constructor
         * 6. Father普通代码块
         * 7. Father 构造器
         * 8. Son 普通代码块
         * 9. Son 构造器
         *
         * 在子孙三代都加上普通方法和代码块后再次执行：
         * 1. GrandFather static block
         * 2. getA 静态方法
         * 3. getB 静态方法
         * 4. Father static block
         * 5. Son static block
         * 6. getC 静态方法
         * 7. GrandFather 普通代码块
         * 8. getA2 普通方法
         * 9. GrandFather constructor
         * 10. Father普通代码块
         * 11. getB2 普通方法
         * 12. Father 构造器
         * 13. Son 普通代码块
         * 14. getC2 普通方法
         * 15. Son 构造器
         */
        new Son();
    }
}

class Son extends Father {
    public Son() {
        //super()
        //本类普通代码块和普通属性
        System.out.println("Son 构造器");
    }

    {
        System.out.println("Son 普通代码块");
    }

    static {
        System.out.println("Son static block");
    }

    private static int c = getC();

    public static int getC() {
        System.out.println("getC 静态方法");
        return 100;
    }

    public int c2 = getC2();

    public int getC2() {
        System.out.println("getC2 普通方法");
        return 102;
    }
}

class Father extends GrandFather {
    public Father() {
        //super()
        //本类普通代码块和普通属性
        System.out.println("Father 构造器");
    }

    {
        System.out.println("Father普通代码块");
    }

    private static int b = getB();

    static {
        System.out.println("Father static block");
    }

    public static int getB() {
        System.out.println("getB 静态方法");
        return 10;
    }

    public int b2 = getB2();

    public int getB2() {
        System.out.println("getB2 普通方法");
        return 12;
    }
}

class GrandFather {
    public GrandFather() {
        //super()
        //本类普通代码块和普通属性
        System.out.println("GrandFather constructor");
    }

    {
        System.out.println("GrandFather 普通代码块");
    }

    static {
        System.out.println("GrandFather static block");
    }

    private static int a = getA();

    public static int getA() {
        System.out.println("getA 静态方法");
        return 1;
    }

    public int a2 = getA2();

    public int getA2() {
        System.out.println("getA2 普通方法");
        return 2;
    }
}