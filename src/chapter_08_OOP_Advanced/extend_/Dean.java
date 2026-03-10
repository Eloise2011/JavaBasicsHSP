package chapter_08_OOP_Advanced.extend_;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2025-12-12 17:16
 */
public class Dean extends Docter{
    boolean isPrivileged;

    public Dean(boolean isPrivileged,String name) {
        super(name);
        this.isPrivileged = isPrivileged;
    }
}
