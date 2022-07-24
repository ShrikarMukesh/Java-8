package functionalInterfaces;

import java.util.function.BiFunction;

public class BiFuctionPractice {
    public static void main(String[] args) {

        BiFunction<String,String,String> function = (a,b)->(a+b);

        System.out.println(function.apply("Shrikar","mukesh"));

        BiFunction<String,String,Integer> function2 = (a,b)->(a+b).length();

        System.out.println(function2.apply("Shrikar","mukesh"));
    }
}
