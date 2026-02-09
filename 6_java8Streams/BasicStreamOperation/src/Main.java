import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//        Filter even numbers from a list of integers.
//        numbers.stream().filter( number -> number % 2 ==0).forEach(System.out::println);

//        Sort a list of integers in descending order using streams
//        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        Remove duplicate elements from a list using distinct().
//        numbers.stream().distinct().sorted().forEach(System.out::println);

        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy","",null);
//         Find names starting with a specific letter from a list of strings.
        List<String> findA = names.stream().filter(n -> n != null  && n.toLowerCase().startsWith("a") )
                .collect(Collectors.toList());

            System.out.println(findA);

        //Convert all strings to uppercase using stream.
//        names = names.stream().map(value ->
//                value.toUpperCase())
//                .collect(Collectors.toList());
//
//             System.out.println(names);

    }
}