package org.elevens;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

// Write a program to find the common elements between two arrays using java8?
//Input: (71, 21, 34, 89, 56, 28); (12, 56, 17, 21, 94, 34)
//Output:
//21
//34
//56
public class StreamExample {
    public static void main(String[] args) {
        int[] array = {71, 21, 34, 89, 56, 28};
        OptionalInt secondMax = Arrays.stream(array)
                .distinct() // Remove duplicates if any
                .sorted() // Sort in ascending order
                .skip(array.length - 2) // Skip to the second last element
                .findFirst();
        secondMax.ifPresentOrElse(
                value -> System.out.println("Second maximum element: " + value),
                () -> System.out.println("Array does not have enough distinct elements")
        );


    }
}
