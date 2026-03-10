package chapter03;

/**
 * @author Joshua.H.Brooks
 * @description 1. 系统会首先自动吧所有数据类型转换成精度最大的类型
 * 2. 当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时， 就会报错，反之就会进行自动类型转换。
 * @date 2025-12-09 08:28
 */
public class _03AutoConverterDetails {
    public static void main(String[] args) {
        int n1 = 10;
        // float d1=n1+1.1; //错误❌ 结果类型是double，系统会首先自动吧所有数据类型转换成精度最大的类型 in this case： double， 再赋值给float就会报错。
        //怎么解决呢？ 两种方案
        // 方案一：✅ 显示声明1.1为float就不会报错
        float f1 = n1 + 1.1F;
        // 方案二： ✅ 或者增大最后结果变量的精度
        double d1 = n1 + 1.1;
        System.out.println("d1 = " + d1);

        /**
         *  1. char-> int -> long -> float -> double
         *  2. byte -> short -> int -> long -> float -> double
         *  3. 注意⚠️： byte & char 或者 short & char之间不会发生自动类型转换
         */
        // ✅ 因为 byte可以存储的数据值范围是-128-127， 在范围内就不会进行类型判断
        byte b1 = 10;
        //java: incompatible types: possible lossy conversion from int to byte
        // b1 = 1000 ;
        int n2 = 1;
        //报错❌： java: incompatible types: possible lossy conversion from int to byte
        //如果是赋变量值会进行类型判断
        //byte b2 = n2;
        // 因为char & byte 不会自动转换，所以也会报错❌ java: incompatible types: possible lossy conversion from byte to char
        // char c1 = b1;

        /**
         * byte short char 三者可以计算，在计算时首先会转换为int 类型
         */
        byte b2 = 1;
        byte b3 = 1;
        short s2 = 1;
        //java: incompatible types: possible lossy conversion from int to short
        //short s3 = s2 + b2 ;
        // byte b4 = b2 + b3; 即使都是byte， 但是只要等号右边进行运算，就会先转为int

        /**
         * boolean不会和任何其他数据类型进行转换
         */
        boolean pass = true;
        // 报错❌：java: incompatible types: boolean cannot be converted to int
        // int num = pass;

        /**
         * 自动提升原则： 表达式结果的类型自动提升为操作数中最大的类型
         */
        byte b4 = 1;
        short s4 = 100;
        int i4 = 12345;
        float f4 = 12.34F;
        f4 = b4 + s4 + i4 + f4;
        System.out.println("f4 = " + f4);
        double d4 = 55.55;
        // 报错❌： java: incompatible types: possible lossy conversion from double to float
        //f4 = b4 + s4 + i4 + f4 + d4;
        d4 = b4 + s4 + i4 + f4 + d4;
        System.out.println("d4 = " + d4);
    }
}