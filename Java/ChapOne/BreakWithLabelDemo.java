
/**
 * Write a description of class BreakWithLabelDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BreakWithLabelDemo
{
    // create a 2 dimensional int array:
    //Using  an unlabeled break to terminate for:
    void foundBreak(int[] arrayDouble, int searchfor, boolean foundIt, int i) {
    for (i = 0; i <= arrayDouble.length; i++) {
        if (arrayDouble[i] == searchfor) {
            System.out.println("Found it!");
            break;
        }
    }
    if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
}
void labeledBreak(int[][] arrayOfInts, int searchfor, boolean foundIt, int i, int j) {
    search:
    for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }
        
        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
}
}
