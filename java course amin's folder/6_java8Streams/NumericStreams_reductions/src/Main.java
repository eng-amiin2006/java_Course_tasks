import java.util.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

//        Calculate the sum of a list of integers using reduce.

            int sum = numbers.stream().reduce(0 ,(num1 , num2)-> num1+num2);
                System.out.println(sum);

//        Find the maximum and minimum value in a list.
//       int max = numbers.stream().mapToInt(Integer::intValue).max().orElseThrow();
//        System.out.println("the max num is :"+max);
//        int  min = numbers.stream().mapToInt(Integer::intValue).min().orElseThrow();
//        System.out.println("the min num is : "+min);

//        Calculate the average of a list of doubles.
//        double avg = numbers.stream().mapToDouble(Integer::doubleValue).average().orElseThrow();
//        System.out.println("the average is : "+avg);

//        Multiply all integers in a list together using reduce.

//            int mul = numbers.stream().reduce(1 ,(num1 , num2)-> num1 * num2);
//        System.out.println("the result of multiplication is : "+mul );

//        Count how many numbers are positive in a list.
//        long countPositive = numbers.stream().filter(num -> num >0 ).count();
//        System.out.println(countPositive);


    }
}