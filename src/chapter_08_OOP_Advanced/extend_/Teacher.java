package chapter_08_OOP_Advanced.extend_;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 15:42
 */
public class Teacher extends Person{
    private String subject;

    public void testing(){
        System.out.println("老师 "+getName()+" 正在教数学课");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }


    public Teacher(String name, String complexion, int age, String profession, String subject) {
        super(name, complexion, age, profession);
        this.subject = subject;
    }
}
