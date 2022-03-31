import java.util.Scanner;

public class P9_PrintCityName_Switch {
    /**
     * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
     * any other alphabet should be invalid entry USING SWITCH STATEMENT
     */
    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
       String city =  sc.next().toUpperCase();
       P9_PrintCityName_Switch obj = new P9_PrintCityName_Switch();
       obj.printCityName(city);
    }
}
