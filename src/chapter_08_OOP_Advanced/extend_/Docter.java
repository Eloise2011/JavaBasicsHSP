package chapter_08_OOP_Advanced.extend_;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 15:39
 */
public class Docter extends Person {
    private String dressCode;

    public void testing(){
        System.out.println("医生"+name+"正在做手术");
        System.out.println("医生"+complexion+"正在做手术");
        System.out.println("医生"+age+"正在做手术");
        //System.out.println("医生"+profession+"正在做手术");
    }

    public String getDressCode() {
        return dressCode;
    }

    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    public Docter() {
        System.out.println("👦子类无参构造器执行...");
    }

    public Docter(String name, String complexion, int age, String profession, String dressCode) {
        //调用父类的构造器， 必须在第一行
        super(name, complexion, age, profession);
        this.dressCode = dressCode;
        System.out.println("👦子类👊参构造器执行...");
    }

    public Docter(String dressCode) {
        //super(); 默认会调用，可以省略
        this.dressCode = dressCode;
        System.out.println("👦子类🈶参构造器执行...");
    }
}
