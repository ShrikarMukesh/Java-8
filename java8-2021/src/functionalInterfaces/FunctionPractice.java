package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String,Integer> function = e->e.length();
        List<String> list = Arrays.asList("Rajkumar","Jhon","Lingard");

        int[] integers = map(function,list);
        for (int i: integers){
            System.out.println(i);
        }
    }

    private static int[] map(Function<String, Integer> function, List<String> list) {
         int[] integers = new int[4];
         int i=0;
         int counter = 0;
         for (String str : list){
             counter = function.apply(str);
             integers[i] = counter;
             i++;
         }
         return integers;
    }
}
