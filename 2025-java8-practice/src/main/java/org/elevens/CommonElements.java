package org.elevens;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args) {
        // Input arrays
        Integer[] array1 = {71, 21, 34, 89, 56, 28};
        Integer[] array2 = {12, 56, 17, 21, 94, 34};

        // Convert arrays to lists
        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);

        // Find common elements using Java 8 streams
        List<Integer> commonElements = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        // Output common elements
        System.out.println("Common Elements:");
        commonElements.forEach(System.out::println);
    }
}

