// Question 5:- Write a program to sort HashMap by value.

import java.util.*;

public class Fifth {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Cherry", 15);
        map.put("Date", 8);

        System.out.println("Original Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        System.out.println("\nSorted Map:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}