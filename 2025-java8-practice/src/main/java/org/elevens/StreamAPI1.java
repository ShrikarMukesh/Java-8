package org.elevens;

import java.util.Arrays;
import java.util.List;

public class StreamAPI1 {
    public static void main(String[] args) {
        //Find Even Numbers
        List<Integer> numbers = Arrays.asList(12, 7, 5, 8, 10, 21);
        List<Integer> res = numbers.stream().filter(integer -> integer%2 == 0).toList();
        System.out.println(res);

        List<String> words = Arrays.asList("banana", "apple", "mango", "grape", "orange");
        List<String> res1  = words.stream().sorted().toList();
        System.out.println(res1);

        //count words
        List<String> words2 = Arrays.asList("hello", "world", "java", "stream", "filter", "hello");
        long output = words2.stream().distinct().count();
        System.out.println(output);


    }
}
