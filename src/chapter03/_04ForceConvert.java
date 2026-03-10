package chapter03;

/**
 * @author Joshua.H.Brooks
 * @description 强制类型转换
 * 自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。
 * 使用时要加上强制转换符（），但可能造成精度降低或溢出，格外要注意。
 * @date 2025-12-09 09:38
 */
public class _04ForceConvert {

    public static void main(String[] args) {
        float f1 = 1.9f;
        int n1 = (int) f1;
        //结果是1
        System.out.println("n1 = " + n1);

        int n2 = 2000;
        byte b1 = (byte) n2;
        // 结果是 -48
        System.out.println("b1 = " + b1);

        int n3 = 10;
        float f3 = 1.5f;
        double d3 = 2.5;
        /**
         * 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
         * 否则下面代码会报编译错误❌
         * java: incompatible types: possible lossy conversion from double to int
         */
        //
        int n4 = (int) (n3 + f3 + d3);
        System.out.println("n4 = " + n4);

        /**
         * char 类型可以保存int 的常量值，但是不能保存int的变量值，需要强制转换
         */
        char c1 = 100; //ok
        int n5 = 100;
        //char c2 = n5; // not ok; incompatible types: possible lossy conversion from int to char
        char c3 = (char) n5; // ok
        System.out.println("c3 = " + c3); //结果为： d

        /**
         * byte、 short、char类型在进行运算时
         */

        short s = 12;
        // s = s-9; // ❌ int -> short
        byte b = 10;
        //b = b+11; // ❌ int -> byte
        b = (byte)(b+11); //✅ 强制转换
        char c = 'a';
        int i = 16;
        float f = .314F;
        double d = c+i+f; // ✅ 自动转换

        byte b2=16;
        short s2 =14;
        //short t = s2+b2; // ❌ int -> short


    }

}
