package org.elevens;

import java.util.*;

public class SecondMaxElement {
    public static void main(String[] args) {
        //VVImp : we have to take Integer object not int
        Integer[] array = {71, 21, 34, 89, 56, 28};
        List<Integer> integerList = Arrays.asList(array);
        Optional<Integer> secondMaxElement = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondMaxElement.ifPresentOrElse(
                value -> System.out.println("Second maximum element: " + value),
                () -> System.out.println("Array does not have enough distinct elements")
        );

        // Input array
        int[] array1 = {71, 21, 34, 89, 56, 28};

        // Find the second maximum element
        OptionalInt secondMax = Arrays.stream(array1)
                .distinct() // Remove duplicates if any
                .sorted() // Sort in ascending order
                .skip(array1.length - 2) // Skip to the second last element
                .findFirst(); // Get the second maximum element

        // Print the second maximum element
        secondMax.ifPresentOrElse(
                value -> System.out.println("Second maximum element: " + value),
                () -> System.out.println("Array does not have enough distinct elements")
        );
    }
}
