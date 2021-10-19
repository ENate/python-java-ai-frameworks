
/**
 * Write a description of class EnhabcedForDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EnhabcedForDemo
{
    // instance variables - replace the example below with your own
    
    // Defining enhanced for
    void enhancedFor(int [] anArray) {
        System.out.println("Count using the enhanced for...");
        for (var num: anArray) {
            System.out.println("Count : " + num);
        }
    }
}
