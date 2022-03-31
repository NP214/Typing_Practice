import java.util.Scanner;

public class P2_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = sc.nextInt();
        IsLeapYear(year);
        sc.close();

    }
    public static void IsLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The " + year + " is leap year");
        return;
        }
        System.out.println("The " + year + " is not leap year");
    }
}
