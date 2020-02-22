package java8.streams;

import java.util.ArrayList;

public class ToArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);al.add(21);al.add(1);al.add(3);al.add(54);
        System.out.println(al);
        Integer[] ir = al.stream().toArray(Integer[]::new);
        for(Integer i : ir){
            System.out.print(i+" ");
        }
    }
}
