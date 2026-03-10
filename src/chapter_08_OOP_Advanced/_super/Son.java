package chapter_08_OOP_Advanced._super;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 21:49
 */
public class Son extends Papa{

    public int n1 = 1000;

    void hi(){
        /**
         *  找greeting()方法时，顺序是：
         * 1）先找本类，如果有，则调用
         * 2）如果没有，则找父类（如果有，并可以调用，则调用〕
         * 3）如果父类没有，则继续找父类的父类，一直到 Object类
         * // 提示：如果查找方法的过程中，找到了，但是不能访问（private），则报错
         * // 如果一直到object也没找到，也报错
         * this.greeting() 和直接greeting() 是等价的
         * super.greeting() 没有第一步，会直接从直接父类一步步往上找，直到找到并调用或者找不到解析出错。
         */
        //greeting();
        //this.greeting();
        super.greeting();
    }

    @Override
    public void greeting() {
        System.out.println("son saying hi");
    }
}
