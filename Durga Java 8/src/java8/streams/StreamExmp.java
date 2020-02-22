package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExmp {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Shrikar");
        al.add("Dinesh");
        al.add("Jp");
        al.add("Veeru");
        al.add("Monk");al.add("lo");
        System.out.println(al);
        List<String>  l = al.stream().filter(s->s.length() >=5).collect(Collectors.toList());
        System.out.println(l);
        List<String> l2 = al.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);
        long count = al.stream().filter(s->s.length()>=4).count();
        System.out.println(count);
     }
}
