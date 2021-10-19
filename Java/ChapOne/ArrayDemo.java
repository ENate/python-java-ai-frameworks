
/**
 * Write a description of class ArrayDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayDemo
{
    // declare an array of integers
    int[] anArray;
    int[] arrayDest;
    //  Multi dimensional arrays
    int[][] doubledArray;
    /**
     * Constructor for objects of class ArrayDemo
     */
    public ArrayDemo()
    {
        // initialise instance variables
        anArray = new int[4];
        anArray[0] = 2;
        anArray[1] = 3;
        anArray[2] = 21;
        anArray[3] = 31;
        // specify size of destination array
        arrayDest = new int[3];
        // Fill up double arrays
        doubledArray = new int[2][2];
        doubledArray[0][0] = 0;
        doubledArray[0][1] = 10;
        doubledArray[1][0] = 11;
        doubledArray[1][1] = 2;
    }
    
    public static void main(String [] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        System.out.println("The Array values are " + arrayDemo.anArray[0] + arrayDemo.anArray[1]);
    
        System.arraycopy(arrayDemo.anArray, 0, arrayDemo.arrayDest, 0, 2);
        for (int val: arrayDemo.arrayDest){
            System.out.println(val + " ");
        }
        // Use range to copy
        int [] copyTo = java.util.Arrays.copyOfRange(arrayDemo.arrayDest, 0, 3);
        for (int valuesToCpy : copyTo) {
            System.out.println(valuesToCpy + " ");
        }
        // Converting an array to a string
        System.out.println(java.util.Arrays.toString(copyTo)); 
        
        // String formatting the double array
        System.out.println(java.util.Arrays.toString(new ArrayDemo().doubledArray));
        // Using aggregrations
        java.util.Arrays.stream(copyTo).map(vals -> vals).forEach(System.out::print);  

        
        
    }

    
}
