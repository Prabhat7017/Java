//Question 3:-Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and
//their salary as value and perform reverse sorting of salary with the help of Comparator.

import java.util.*;

class Person {
    String name;
    int age;
    String designation;
    double salary;

    public Person(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Third {
    public static void main(String[] args) {

        Person p1 = new Person("John Doe", 30, "Software Engineer", 100000.0);
        Person p2 = new Person("Jane Smith", 25, "Data Scientist", 120000.0);
        Person p3 = new Person("Bob Johnson", 40, "Product Manager", 150000.0);


        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);


        Collections.sort(persons, (o1, o2) -> Double.compare(o2.salary, o1.salary));

        System.out.println("Sorted list of persons by salary in descending order:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}