import java.util.Scanner;

public class Task4_AccessArrayElement {
    public static void main (String [] args)
{
    Scanner input = new Scanner(System.in);
    int [] numbers = {12,3,4,57,8};
    try {
        System.out.println("Enter the index what you want to print ");
        int index= input.nextInt();
        System.out.println("the number is :"+ numbers[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("invalid index");
    }

}
}
