package Durga.predicate;
import java.util.function.Predicate;
public class PredicateJoining {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30};
        Predicate<Integer> p1 = i->i>10;
        Predicate<Integer> p2 = i->(i % 2)==0;
        System.out.println("Numbers greater than 10");
        print(p1,x);
        System.out.println("Numbers Which are divisible 2");
        print(p2,x);
        System.out.println("Numbers Not greater than ten");
        print(p1.negate(),x);
        System.out.println("Numbers Which are greater then 10 and  divisible 2");
        print(p1.and(p2),x);
        System.out.println("Numbers Which are greater then 10 or divisible 2");
        print(p1.or(p2),x);
    }
    private static void print(Predicate<Integer> p,int x[]){
        for(int element : x){
            if(p.test(element)) {
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }
}
