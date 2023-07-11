package demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {

       List<Integer> integerList = List.of(1,299,3,3,2,1,8,9);

        Set<Integer> integerSet = new HashSet<>();
        integerList.stream().filter(
                integer -> (!integerSet.add(integer))
        ).forEach(System.out::println);
    }
}

