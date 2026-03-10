package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 16:37
 */
public class CodeBlockExec {
    public static void main(String[] args) {
        /**
         * in static code block
         * total = 100
         * total = 100
         */
        System.out.println("total = " + Person.total);
        System.out.println("total = " + Person.total);
    }

}
class Person{
    public static int total ;
    static {
        total = 100;
        System.out.println("in static code block");
    }
}
