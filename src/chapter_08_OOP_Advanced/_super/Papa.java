package chapter_08_OOP_Advanced._super;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 21:49
 */
public class Papa extends GrandPa{
    public String name;
    protected String complexion;
    boolean isFat;
    private int age;

    public int n1 = 500;



    @Override
    public void greeting(){
        System.out.println("papa saying hi");
    }

    public String getName() {
        return name;
    }

    public String getComplexion() {
        return complexion;
    }

    private boolean isFat() {
        return isFat;
    }

    public int getAge() {
        return age;
    }
}
