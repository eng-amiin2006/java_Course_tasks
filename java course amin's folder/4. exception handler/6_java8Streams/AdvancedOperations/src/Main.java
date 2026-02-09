import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );

//        Sort a list of employees by salary then by name
//            List<Employee> sortWithNameAndSalary =employees.stream()
//                    .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
//                    .toList();
//            sortWithNameAndSalary.forEach(sort -> System.out.println(sort.getName()+" - "+sort.getSalary()));


        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//        Find the second-highest number in a list.
//            Optional<Integer> findSecond = numbers.stream().distinct().sorted(Comparator.reverseOrder())
//                    .skip(1).findFirst();

//            findSecond.ifPresent(System.out::println);

//                    Find duplicate elements in a list of integers.
//        Set<Integer> findDuplicated = numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1)
//                .collect(Collectors.toSet());
//        System.out.println(findDuplicated);

        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);

        //        Remove null or empty strings from a list using stream.

//            List<String> remove= names.stream().filter(Objects::nonNull).filter(r -> !r.isEmpty())
//                    .toList();
//        System.out.println(remove);

        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );

//        Partition students into pass/fail groups based on grade.
        Predicate<Student> passOrFail = s -> s.getGrade() >= 50;
        Map<Boolean, List<Student>> result = students.stream()
                        .collect(Collectors.partitioningBy(passOrFail));
        System.out.println("Passed students:");
        result.get(true).forEach(s -> System.out.println("-" + s.getName()));
        System.out.println("Failed students:");
        result.get(false).forEach(s -> System.out.println("-" + s.getName()));
    }
}