
/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{
    // instance variables - replace the example below with your own
    private static int x;
    // Main class and starting point of program
    public static void main(String [] args) {
        System.out.println("This is the first Java Program");
        int y = 10;
        int XYProduct = sampleMethod(y);
        System.out.println("Product of X and Y: " + XYProduct);
    }

    /**
     * Constructor for objects of class HelloWorld
     */
    public HelloWorld()
    {
        // initialise instance variables
        x = 20;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int sampleMethod(int y)
    {
        // put your code here
        return x - y;
    }
}
