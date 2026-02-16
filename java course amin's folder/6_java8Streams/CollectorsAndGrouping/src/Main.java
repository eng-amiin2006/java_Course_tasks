import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );
//        Map<String,List<Student>> groupBy = students.stream().collect(Collectors.groupingBy(Student::getDepartment));
//        System.out.println(groupBy);
//        groupBy.forEach((dept ,list ) ->{
//            System.out.println(dept);
//            list.forEach(s -> System.out.println(" "+s.getName()));
//        } );

        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//        Map<Boolean, List<Integer>> evenOrOdd = numbers.stream()
//                .collect(Collectors.partitioningBy(num -> num %2 ==0 ));
//        System.out.println("the even numbers is : "+evenOrOdd.get(true));
//        System.out.println("the odd numbers is : "+evenOrOdd.get(false));

//        Create a comma-separated string from a list of strings.
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//        String createComma = names.stream().collect(Collectors.joining(" - "));
//        System.out.println(createComma);


//        Group employees by age and count how many per age.
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );
//        Map<Integer, Long> byAge =employees.stream()
//        .collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));
//        byAge.forEach((age,counter)-> System.out.println("Age: " + age +" num of employees: "+counter));

//        Find the average salary per department in a list of employees.
        Map<String ,Double> findAvg = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
            findAvg.forEach((depart,avg)-> System.out.println(depart+" Average salary: "+ avg));
    }
}