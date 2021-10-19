
/**
 * Write a description of class ForDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForDemo
{
    // The use of FOR
    public static void main(String[] args) {
        for (int indexVal = 0; indexVal <= 4; indexVal++){
        System.out.println(indexVal + " ");}
        int [] numbers = {0, 2, 3, 2, 4,1, 11, 10, 9, 8};
        // Demonstrating the enhanced for statement
        EnhabcedForDemo enhancedForDemo = new EnhabcedForDemo();
        enhancedForDemo.enhancedFor(numbers);
    }
}
