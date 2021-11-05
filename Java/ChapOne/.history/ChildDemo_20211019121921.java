
/**
 * Write a description of class ChildDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChildDemo
{
    // instance variables - replace the example below with your own
    public static void main(String [] args) {
        ChildImpl child = new ChildImpl();
        ParentImpl parentImp = new ChildImpl();
        ParentImpl parent = new ParentImpl();
        System.out.println("parent instanceof ParentImpl: "
            + (parent instanceof ParentImpl));
        System.out.println("parentImpl instanceof Child: "
            + (parentImp instanceof ChildImpl));
    }
}
