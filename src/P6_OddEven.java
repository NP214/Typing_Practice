import java.util.Scanner;

public class P6_OddEven {
/** Write a java program to input any number and find out if it’s odd or even
 */
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = sc.nextInt();
       P6_OddEven oddEven = new P6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
        // Closing the scanner object
        sc.close();
    }

    // Checking the odd or even
    public String isItEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
