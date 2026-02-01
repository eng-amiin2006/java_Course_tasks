import java.util.Scanner;

public class Task2_ConvertStringToInteger {
    public static void main(String []args)
    {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter numbers to convert it to int ");
            String numInString = input.nextLine();
            try {
                int numToInt = Integer.parseInt(numInString);
                System.out.println(numToInt + 1);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number \n try again.");
            }
        }
    }
}
