package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicsStrong");

        Predicate<String> predicate1 = s->!s.isEmpty();
        Predicate<String> predicate2 = s->s.contains("Basic");

        List<String> output1 = filterList(predicate1,list);
        output1.stream().forEach(System.out::println);

        List<String> output2 = filterList(predicate2,list);
        output2.stream().forEach(System.out::println);

        List<Integer> ints = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> p = integer -> integer%2==0;

        List<Integer> output3 = filterList(p,ints);
        output3.forEach(r-> System.out.println(r));
        
     }

    private static <T> List<T> filterList(Predicate<T> predicate, List<T> list) {
        List<T> result = new ArrayList<>();
        for (T str:list){
            if(predicate.test(str)){
                result.add(str);
            }
        }
        return result;
    }
}
