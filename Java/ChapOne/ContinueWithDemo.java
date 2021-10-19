
/**
 * Write a description of class ContinueWithDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContinueWithDemo
{
    // instance variables - array
    void continueDemo(int max, String searchMe, int numPs) {

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
    // Continue with label:
    void continueStatementWithDemo(String searchMe, String substring, boolean foundIt, int max) {
        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
