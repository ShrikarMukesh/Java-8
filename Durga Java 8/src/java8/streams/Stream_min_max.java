package java8.streams;
import java.util.ArrayList;
public class Stream_min_max {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);al.add(5);al.add(23);al.add(0);al.add(2);al.add(31);
        System.out.println(al);
        Integer min = al.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("Minimum value = "+min);
        Integer max = al.stream().max((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("Minimum value = "+max);
    }
}
