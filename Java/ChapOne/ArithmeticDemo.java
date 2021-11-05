
/**
 * Write a description of class ArithmeticDemo here.
 *
 * @author (your name)
i * @version (a version number or a date)
 */
public class ArithmeticDemo
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        int result = 2 + 1;
        // sums to 3
        System.out.println("The result is now: " + result);
        int originalResult = result;

        // doubles the original result
        int newResult = originalResult * 2;
        System.out.println("The new result is now: " + newResult);

        int increment = 1;
        // prefix
        increment++;
        System.out.println("Prints 2: " + increment);
        ++increment;
        System.out.println("Prints 3: " + increment);
        System.out.println("The prefix increment: " + ++increment);
        // postfix
        System.out.println("The prefix increment: " + increment++);
        // Demonstrating tenary operator:
        int value1 = 12;
        int value2 = 34;
        boolean myCondition = value1 < value2;
        int resultTenary = myCondition ? value2 : value1;
        System.out.println("Tenary operator ?: result: " + resultTenary);
        System.out.println("The end of this program");

    }
}
