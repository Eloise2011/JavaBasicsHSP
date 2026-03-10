package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 16:26
 */
public class CodeBlockDetail05 {
    public static void main(String[] args) {
        new A02();
    }
}
class A02{
    private int n1 = 100;
    private static int n2 = 200;
    private void m1(){

    }
    private static void m2(){
        //System.out.println(n1); 编译报错
        System.out.println(n2);

    }
    static {
        System.out.println("静态代码块进行以下调用: ");
        // m1(); 编译报错
        System.out.print("静态方法: ");
        m2();
    }
}
