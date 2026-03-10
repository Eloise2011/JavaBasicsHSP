package chapter10.src.com.hspedu.main_;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 00:06
 */
public class Main01 {
    // 静态变量/属性
    private static String name = "韩顺平教育";
    //非静态变量/属性
    private int n1 = 1000;

    //静态方法
    private static void hi(){
        System.out.println("Main01 的hi方法");
    }

    //非静态方法
    public void cry(){
        System.out.println("Main01 的cry方法");
    }

    /**
     * 结论：
     * 1. 静态方法main可以访问本类的静态成员， 不可以访问本类的非静态成员 （成员包括属性和方法）
     * 2. 静态方法main如果非要访问本类的非静态成员，需要先创建对象，再调用即可
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(name);
        // 编译报错： Non-static filed n1 cannot be referenced from a static context
        //System.out.println(n1);
        hi();
        // 编译报错： Non-static method cry cannot be referenced from a static context
        //cry();
        Main01 main01 = new Main01();
        //创建对象后，之前不可访问的成员都可以访问了
        System.out.println(main01.n1);
        main01.cry();

    }

}
