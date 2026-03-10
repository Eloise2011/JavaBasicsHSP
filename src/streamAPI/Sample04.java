package streamAPI;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-09 21:18
 */
public class Sample04 {
    static int add(int a, int b) {
        return a + b;
    }

    interface Lambda {
        int calculate(int a, int b);
    }

    static Lambda addLambda = (a, b) -> a + b;

    public static void main(String[] args) {
        System.out.println(addLambda.calculate(1,2));
        System.out.println(Sample04.add(1,3));

    }

}
