import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

//        Find the first element in a stream that matches a given condition
//              Optional<Integer> findFirst= numbers.stream().filter(number -> number % 2 ==0).findFirst();
//              findFirst.ifPresent(System.out::println);

//        Check if any number is divisible by 5 in a list
//                boolean check = numbers.stream().anyMatch(number -> number %5 ==0 );
//                System.out.println(check);

//        Collect elements into a Set instead of a List.
//            Set<Integer> intoSet = numbers.stream().collect(Collectors.toSet());
//                        System.out.println(intoSet);

//       Skip the first 3 elements and return the rest.
//            List<Integer> skipFirst3 = numbers.stream().skip(3).toList();
//                System.out.println(skipFirst3);

        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy","",null);

//        Count the number of strings longer than 5 characters.
//             long counter = names.stream()
//                    .filter(s -> s.length() > 5)
//                    .count();

//        System.out.println(counter);

    }
}