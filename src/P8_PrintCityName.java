import java.util.Scanner;

public class P8_PrintCityName {
    /**
     * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
     * any other alphabet should be invalid entry
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        char city = sc.next().charAt(0);
        // Object creation
       P8_PrintCityName cityname = new P8_PrintCityName();
        cityname.printCityName(city);
        //Closing the scanner object
        sc.close();
    }

    //Printing city name
    public void printCityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Derby");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Feltham");
        } else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
