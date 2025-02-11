//WAP using java 8:
//
//        -> Collect all  even numbers from a list using stream
//        -> Given a list of objects of following class:
//
//class Employee{
//    String fullName;
//    Long salary;
//    String city;
//}
//
//    Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//        Note: Full name is concatenation of first name, middle name and last name with single space in between.
//

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Fourth {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Using stream to collect even numbers
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(n -> n % 2 == 0)  // Filtering even numbers
//                .collect(Collectors.toList());  // Collecting the result into a list
//
//        System.out.println("Even Numbers: " + evenNumbers);


        List<Employee> employees = Arrays.asList(
                new Employee("John Doe Smith", 4500L, "Delhi"),
                new Employee("Alice Mary", 6000L, "Delhi"),
                new Employee("Bob Singh", 4000L, "Delhi"),
                new Employee("John Smith", 3000L, "Mumbai"),
                new Employee("Ravi Kumar", 3500L, "Delhi")
        );

        // Collect unique first names of employees whose salary is < 5000 and live in Delhi
        List<String> firstNames = employees.stream()
                .filter(e -> e.getSalary() < 5000 && e.getCity().equals("Delhi"))
                .map(e -> e.getFullName().split(" ")[0])  // Extract first name
                .distinct()  // Make sure the first names are unique
                .collect(Collectors.toList());  // Collect to a list

        System.out.println("Unique First Names: " + firstNames);
    }
}
class Employee {
    String fullName;
    Long salary;
    String city;

    Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}
