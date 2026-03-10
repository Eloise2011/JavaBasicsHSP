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
         */
        new Son();
    }
}

class Son extends Father {
    public Son() {
        //super()
        //本类代码块
        System.out.println("Son 构造器");
    }

    {
        System.out.println("Son 普通代码块");
    }

    static {
        System.out.println("Son static block");
    }
}

class Father extends GrandFather {
    public Father() {
        //super()
        //本类普通代码块
        System.out.println("Father 构造器");
    }

    {
        System.out.println("Father普通代码块");
    }

    static {
        System.out.println("Father static block");
    }
}

class GrandFather {
    public GrandFather() {
        //super()
        //本类普通代码块
        System.out.println("GrandFather constructor");
    }

    {
        System.out.println("GrandFather 普通代码块");
    }

    static {
        System.out.println("GrandFather static block");
    }
}