package chapter10.src.com.hspedu.main_;

/**
 * @author Joshua.H.Brooks
 * @description
 * main方法 签名 语法结构解析：
 * 1. main方法是虚拟机调用的
 * 2. Java 虚拟机需要调用该方法，所以其访问权限是public
 * 3. Java虚拟机在访问该方法时不需要创建对象，所以有static修饰符
 * 4. 该方法接受String类型的数组参数，该数组中保存执行Java命令是传递的所有参数
 * 5. 虚拟机执行完不需要程序有明确的返回所以是void
 */
public class Main00 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + i +"个参数是: " + args[i]);
        }
    }
}
