package chapter_08_OOP_Advanced.extend_;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 15:44
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        //Person person = new Person();
        System.out.println("=====第1️⃣个对象:=======");
        Docter docter = new Docter();
        System.out.println("=====第2️⃣个对象:=======");
        Docter docter2 = new Docter("formal");
        //Teacher teacher = new Teacher();
        Dean dean = new Dean(true,"高手");
    }
}
