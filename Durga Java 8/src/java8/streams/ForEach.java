package java8.streams;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("BB");
        al.add("CCC");
        System.out.println(al);
        al.stream().forEach(s-> System.out.println(s));
        al.stream().forEach(System.out::println);
    }
}
