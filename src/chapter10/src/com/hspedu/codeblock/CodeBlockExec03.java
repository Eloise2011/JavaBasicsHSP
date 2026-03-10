package chapter10.src.com.hspedu.codeblock;

/**
 * @author Joshua.H.Brooks
 * @description 用单例模式练习讲解代码块
 * @date 2026-03-10 17:27
 */

public class CodeBlockExec03 {
    public static void main(String[] args) {
        /**
         * GirlFriend Constructor Called
         * F
         * 从输出的先后顺序可以看出，类加载就创建了实例
         */
        System.out.println(GirlFriend.gender);

        System.out.println(Wife.n1);
        // 调用getInstance才会创建并返回实例
        System.out.println("调用getInstance才会创建并返回实例");
        Wife wife = Wife.getInstance();
        Wife wife2 = Wife.getInstance();
        System.out.println(wife.equals(wife2));
    }
}
class Wife {
    private String name;
    public static int n1 = 999;
    private static Wife wife; // 默认是null
    private Wife(String name) {
        System.out.println("Wife Constructor Called");
        this.name = name;
    }

    private static Wife instance ;

    public static Wife getInstance() {
        if(instance == null){
            System.out.println("还没有老婆, 准备new一个");
            instance = new Wife("小花");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                '}';
    }
}
class GirlFriend{
    public static char gender = 'F';
    private String name;
    private GirlFriend(String name) {
        System.out.println("GirlFriend Constructor Called");
        this.name = name;
    }
    private static GirlFriend instance = new GirlFriend("小红");

    public static GirlFriend getInstance() {
        return instance;
    }
}
