import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task7_CustomException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter your age");
            int age = input.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age should be 18+");
            }
            System.out.println("Age verified");
        } catch (InvalidAgeException e) {
            {
                System.out.println(e.getMessage());
            }
        }
    }
}