package java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Sorted {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);al.add(5);al.add(23);al.add(0);al.add(2);al.add(31);
        System.out.println(al);
        Comparator<Integer> comp = (i1,i2) ->i1.compareTo(i2);
        List<Integer> l3 = al.stream().sorted(comp).collect(Collectors.toList());
       // System.out.println(l3);
        List<Integer> l = al.stream().sorted().collect(Collectors.toList());
        //System.out.println(l);
        List<Integer> l2 = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
       // System.out.println(l2);
        l3.stream().forEach(i-> System.out.println(i));

    }
}
