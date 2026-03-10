package chapter07_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-10 10:02
 */
public class UltimateDemo {
    public static void main(String[] args) {
        ArrayList<String> ss = new ArrayList<>();
        ss.add("a");
        ss.add("b");
        demo1(ss);
        System.out.println(factorial(5));
        System.out.println(fbnc(10));
        System.out.println("猴子吃桃解法1: "+monkeyPeach(9));
        System.out.println("猴子吃桃解法2: "+monkeyPeach2(1));


    }

    /**
     * 猴子每天吃当前桃子数量的一半,再多吃一个,等到第十天开始吃之前发现只有一个了， 求第一天的桃子数量
     * 两种解法：
     * @param
     * @return
     */
    private static int monkeyPeach2(int n) {
        if (n == 10) {
            return 1;
        } else if (n >= 1 && n <= 9) {
            return (monkeyPeach2(n + 1) + 1) * 2;
        } else {
            System.out.println("输入参数有问题");
            return -1;
        }
    }

    private static int monkeyPeach(int n) {
        for (int i = 0; i < n; i++) {
            return (monkeyPeach(n - 1) + 1) * 2;
        }
        return 1;

    }

    /**
     * @param a
     */
    public static void demo1(List<String> a) {
        if (a != null) {
            System.out.println(a.size());
            return;
        }
        System.out.println("a is null");
    }

    /**
     * 求一个数的阶乘
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("cant calculate factorial of a number less than 1");
        }
        return n == 1 ? 1 : factorial(n - 1) * n;
    }

    /**
     * 斐波那契数列
     *
     * @param n
     * @return
     */
    public static int fbnc(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fbnc(n - 1) + fbnc(n - 2);
        }


    }
}


