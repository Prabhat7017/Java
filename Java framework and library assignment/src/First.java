//Question 1:-Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
//find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First {
    public static void main(String[] args) {

        List<Float> numbers = new ArrayList<>();


        numbers.add(10.5f);
        numbers.add(20.7f);
        numbers.add(30.3f);
        numbers.add(40.9f);
        numbers.add(50.1f);


        float sum = 0;
        Iterator<Float> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }


        System.out.println("Sum of numbers in List: " + sum);
    }

}