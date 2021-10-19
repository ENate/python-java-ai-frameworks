
/**
 * Write a description of class ContinueBreakWithLabelDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContinueBreakWithLabelDemo
{
    // instance variables - replace the example below with your own
    public static void main(String [] args) {
        ContinueWithDemo continueWithDemo = new ContinueWithDemo();
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;
        // Perform calls
        //======================================================================
        continueWithDemo.continueDemo(max, searchMe, numPs);
        //=======================================================================
        String searchMeWithLabel = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;
        int maxLabel = searchMeWithLabel.length() - substring.length();
        // Call continueDemo
        continueWithDemo.continueStatementWithDemo(searchMeWithLabel, substring, foundIt, maxLabel);
        // Variables for the unlabeled break and labeled labeled statements
        // break Label object class
        BreakWithLabelDemo breakWithLabelDemo = new BreakWithLabelDemo();

        int[] arrayOfIntsLabel =
                { 32, 87, 3, 589,
                  12, 1076, 2000,
                  8, 622, 127 };

        int searchforLabel = 12;
        int iLabel=0;
        boolean foundItL = false;

        breakWithLabelDemo.foundBreak(arrayOfIntsLabel, searchforLabel, foundItL, iLabel);
        //============================================================================
        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
            };
        int searchfor = 12;
        int i=0;
        int j = 0;
        boolean foundItBreakLabeled = false;
        breakWithLabelDemo.labeledBreak(arrayOfInts, searchfor, foundItBreakLabeled, i, j);
    }
}
