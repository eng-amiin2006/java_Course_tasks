import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<List<String>> nestedWords = Arrays.asList(
                Arrays.asList("Java", "Stream"),
                Arrays.asList("API", "Lambda"),
                Arrays.asList("FlatMap", "Map")
        );
//        Flatten a list of lists into a single list.
//        List<String> flatten = nestedWords.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(flatten);


        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//        Extract all unique characters from a list of words.
//        List<Character> uniqueChar = names.stream()
//                .filter(Objects::nonNull)
//                .flatMap(uc->  uc.chars().mapToObj(c->(char)c))
//                .distinct().toList();
//         System.out.println(uniqueChar);

         //        Map a list of strings to their lengths.
//        List<Integer> map = names.stream().filter(Objects::nonNull).map(String::length).collect(Collectors.toList());
//        System.out.println(map);

//        Return a list of uppercased words that start with “A”.
            List<String> returnUpper = names.stream()
                    .filter(Objects::nonNull).filter(name -> name.startsWith("A"))
                    .map(String::toUpperCase).toList();
                        System.out.println(returnUpper);

    }
}