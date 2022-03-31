import java.util.Scanner;

public class P16FindPositiveNegative {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO”
     */
        public static void main(String[] args) {
            //Scanner declaration for reading input form console
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            findNumberIsPositiveNegativeOrZero(number);
            //Closing the scanner object
            sc.close();
        }

        // Finding the number is Positive Negative or Zero
        public static void findNumberIsPositiveNegativeOrZero(int number) {
            if (number > 0) {
                System.out.println(number + " is a POSITIVE number");
            } else if (number < 0) {
                System.out.println(number + " is a NEGATIVE number");
            } else {
                System.out.println(number + " is ZERO");
            }
        }

    }
