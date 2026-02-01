import java.util.Scanner;

public class Task1_dividingTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int num1, num2;
            try {
                System.out.println("enter num 1 ");
                num1 = input.nextInt();
                System.out.println("enter num 2 ");
                num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println(""+result);
                break;

            } catch (ArithmeticException e) {
                System.out.println("can't divide by zero.\n try again!");
            } catch (Exception e) {
                System.out.println("please enter integer only !");
                input.nextLine();
            }
        }
    }
}