package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);al.add(15);al.add(47);al.add(85);al.add(31);al.add(12);al.add(0);
        System.out.println(al);
        List<Integer> l2 = al.stream().map(I ->I*2).collect(Collectors.toList());

      //l2= al.stream().filter(I -> I%2==0).collect(Collectors.toList());
        System.out.println(l2);
        for(Integer i : al){
               if(i % 2 ==0){
                   l2.add(i);
               }
        }
       // System.out.println(l2);

    }
}
