//Qus. 2:-Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.
//Also, Write a program to sort Employee objects based on salary using Comparator.
import java.util.*;

class Employee implements Comparable<Employee> {
    public String firstName;
    public String lastName;
    public Double age;
    public Double salary;

    public Employee(String firstName, String lastName, Double age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        int compareLastName = this.lastName.compareTo(other.lastName);
        if (compareLastName == 0) {
            return this.firstName.compareTo(other.firstName);
        }
        return compareLastName;
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary.compareTo(e2.salary);
    }
}

public class Second {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Doe", 30.0, 5000.0);
        Employee e2 = new Employee("Jane", "Smith", 25.0, 6000.0);
        Employee e3 = new Employee("Bob", "Johnson", 40.0, 4000.0);


        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);


        Collections.sort(employees);

        System.out.println("Employees sorted by last name and first name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        Collections.sort(employees, new SalaryComparator());

        System.out.println("Employees sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}