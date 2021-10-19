
/**
 * Write a description of class BicycleImpl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class BicycleImpl implements InterfaceBicycle
{
    // Define fields
    int cadenceI = 0;
    int speedI = 0;
    int gearI = 1;
    // All methods in the interface have to be implemented
    public BicycleImpl(){
        
    }
    public static void main(String [] args) {
        BicycleImpl bikeImpl = new BicycleImpl();
        bikeImpl.changeCadenceI(12);
    }
    public void changeCadenceI(int newVal) {
        cadenceI = newVal;
    }
    public void changeGearI(int newValue) {
         gearI = newValue;
    }

    public void speedUpI(int increment) {
         speedI = speedI + increment;   
    }

    public void applyBrakesI(int decrement) {
         speedI = speedI - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadenceI + " speed:" + 
             speedI + " gear:" + gearI);
    }

}
