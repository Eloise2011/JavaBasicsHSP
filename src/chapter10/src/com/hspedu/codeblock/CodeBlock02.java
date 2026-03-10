package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 13:03
 */
public class CodeBlock02 {
    public static void main(String[] args) {
        // 调换class A的静态变量n1 和 静态代码块的位置，会发现输出的顺序也会随之变化，因为静态代码块和静态属性的执行优先级是一样的，当有多个时，根据定义他们的顺序执行
        A a = new A();

    }
}
class A{
    private static  int n1 = getN1();
    static {
        System.out.println("A 静态代码块 01");
    }
    public static int getN1(){
        System.out.println("getN1 called");
        return 10;
    }
}