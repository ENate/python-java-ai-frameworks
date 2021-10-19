
/**
 * Write a description of class BicycleDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BicycleDemo
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class BicycleDemo
     */
    public BicycleDemo()
    {
        // initialise instance variables
    }

    /**
     * Define the main method as entry point of the program.
     * Create two Bicycle objects and print state (fields) and behaviours (methods)
     * of the Bicycle class.
     */
    public static void main(String [] args) {
        // Create object with fields and methods
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        // Call methods from the Bicycle class
        // For bike1 object
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
        // For bike2 object
        bike2.changeCadence (50);
        bike2.applyBrakes(12);
        bike2.changeGear(2);
        bike2.speedUp(10);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
