
/**
 * Write a description of class Bicycle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bicycle
{
    // instance variables - replace the example below with your own
    int cadence=1;
    int speed = 0;
    int gear = 0;

    /**
     * Constructor for objects of class Bicycle
     */
    public Bicycle()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    void changeCadence(int newValue)
    {
        // set newValue to gear
        cadence = newValue;
        
    }
    // Doe for gear
    void changeGear(int gearValue) {
        gear = gearValue;
    }
    //Do for speedUP
    void speedUp(int increment) {
        speed = speed + increment;
    }
    // Dof for apply breaks
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    // Printing
    void printStates() {
        System.out.println("Cadence: "+ cadence + " Speed: " + speed + " Gear: " + gear);
    }
}
