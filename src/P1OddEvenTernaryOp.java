import java.util.Scanner;

public class P1OddEvenTernaryOp {
    /*
    1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        IsToOddEvenNumber(number);
        // closing the scanner object
        sc.close();

    }
    public static void IsToOddEvenNumber(int number){
        // ternary operator is used
   String evenOrodd  =   (number %2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrodd + " number" );

    }

}
