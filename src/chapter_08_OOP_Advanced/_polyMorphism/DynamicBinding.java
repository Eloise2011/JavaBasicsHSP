package chapter_08_OOP_Advanced._polyMorphism;

/**
 * @author Joshua.H.Brooks
 * @description
 *
 * Java的动态绑定机制
 *
 * 1. 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
 * 2. 当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
 * @date 2025-12-30 21:52
 */


public class DynamicBinding {
    /**
     * 测试步骤
     * 1. 完整代码， 结果： 40, 30
     * 2. 只注释子类sum方法 结果： 30, 30
     * 3. 只注释子类sum1方法 结果：40, 20
     * 4. 同时注释子类sum、sum1方法 结果： 30, 20
     * @param args
     */
    public static void main(String[] args) {
       A a= new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }

}

class A {
    public int i = 10;

    public int getI() {
        return i;
    }

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }


}

class B extends A{
    public int i = 20;

    @Override
    public int getI() {
        return i;
    }

    @Override
    public int sum() {
        return i + 20;
    }

//    @Override
//    public int sum1() {
//        return i + 10;
//    }


}
