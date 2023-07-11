package first;

import java.util.ArrayList;
import java.util.Comparator;

public class Hack1 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Java");
        list.add(null);
        list.add("Spring");
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(list);
    }
}
