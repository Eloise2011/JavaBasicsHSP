package chapter10.src.com.hspedu.codeblock;


import javax.crypto.spec.PSource;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2026-03-10 11:02
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        new AA(); // 静态代码块执行了
        new BB(); // 单独执行这一行， 静态代码块AA 和 BB都执行了，并且AA先于BB，说明父类代码块先执行。
        //如果同时放开上面两行，发现“AA 类的静态代码块” 只输出一次，说明静态代码块只执行一次

        /**
         * 控制台输出：
         * Cat 的静态代码块被执行
         * 999
         * 说明访问类的静态成员时类就加载，并且类一加载就会先执行静态代码块。 所以有两行输出，并且静态代码块在前
         */
        System.out.println(Cat.n1);

        System.out.println(Dog.n2);

        //可以看到DD的静态代码块只执行了一次，紧接着普通代码块执行了两次。
        //new DD();
        //new DD();
        //下面访问DD的静态成员发现其普通代码块不会执行。
        System.out.println(DD.name);
    }
}

class AA{
    static {
        System.out.println("AA 类的静态代码块");
    }
}
class BB extends AA{ // 继承的本质是先加载父类再加载本类
    static {
        System.out.println("BB 类的静态代码块");
    }
}




class DD{
    public static String name = "DD";
    static {
        System.out.println("DD 类的静态代码块");
    }
    {
        System.out.println("DD 类的普通代码块");
    }
}


class Cat {
    //静态属性
    public  static int n1 = 999;

    static{
        System.out.println("Cat 的静态代码块被执行");
    }
}
class Dog extends Animal {
    //静态属性
    public  static int n2 = 888;

    static{
        System.out.println("Dog 的静态代码块被执行");
    }
}
class Animal{
    String name;
    static {
        System.out.println("Dog的父类代码块被执行");
    }
}
