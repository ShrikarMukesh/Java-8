package java8.streams;

import java.util.stream.Stream;

public class StreamOF {
    public static void main(String[] args) {
        Stream<Integer> s  = Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);

        Double[] d = {10.5,10.1,10.3,23.5};
        Stream<Double> s2 = Stream.of(d);
        s2.forEach(System.out::println);
    }
}
