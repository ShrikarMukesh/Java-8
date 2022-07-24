package predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExmples {
    public static void main(String[] args) {
        Predicate<Integer> p1 = I -> I>10;
        System.out.println(p1.test(100));
        System.out.println(p1.test(3));

        Predicate<String> p2 = s->s.length() >3;
        System.out.println(p2.test("Dinesh"));
        System.out.println(p2.test("hh"));

        System.out.println("Predicate in Collection");
        Predicate<Collection> p3 = c->c.isEmpty();
        ArrayList l1 = new ArrayList();
        System.out.println(p3.test(l1));
        ArrayList l2 = new ArrayList();
        l2.add(12);
        System.out.println(p3.test(l2));

    }
}
