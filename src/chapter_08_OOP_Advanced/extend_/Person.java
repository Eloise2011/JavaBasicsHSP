package chapter_08_OOP_Advanced.extend_;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 15:34
 */
public class Person {
    /**
     * 姓名 公有
     */
    public String name ;
    /**
     * 肤色 保护
     */
    protected String complexion;
    /**
     * 年龄 默认
     */
     int age;
    /**
     * 职业 私有
     */
    private String profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Person() {
        System.out.println("👩父类无参构造器执行...");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String complexion, int age, String profession) {
        System.out.println("👩父类有参构造器执行...");
        this.name = name;
        this.complexion = complexion;
        this.age = age;
        this.profession = profession;
    }
}
