//Question 4:- Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

import java.util.*;

public class Fourth{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        System.out.println("Elements in decreasing frequency:");
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " - Frequency: " + entry.getValue());
        }
    }
}