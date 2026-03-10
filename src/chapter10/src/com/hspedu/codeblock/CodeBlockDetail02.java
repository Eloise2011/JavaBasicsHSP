package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 14:30
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        /**
         * 1. getN1 被调用...
         * 2. A 静态代码块01
         * 3. getN2 被调用...
         * 4. A 普通代码块01
         * 5. 构造器 C() 被调用...
         * 6. getN2 被调用...
         * 7. A 普通代码块01
         * 8. 构造器 C() 被调用...
         */
        C c = new C();
        C c2 = new C();
    }

}
class C{

    public C(){
        System.out.println("构造器 C() 被调用...");
    }

    private int n2 = getN2();
    {
        //
        System.out.println("A 普通代码块01");
    }
    public int getN2(){
        System.out.println("getN2 被调用...");
        return 100;
    }

    private static int n1= getN1();

    static{
        System.out.println("A 静态代码块01");
    }

    public static int getN1(){
        System.out.println("getN1 被调用...");
        return 10;
    }

}
