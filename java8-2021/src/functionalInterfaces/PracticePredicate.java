package functionalInterfaces;

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



        Predicate<String> chechingfirstnamesholnotbenullpredicate = sidda-> sidda.isEmpty();

        Predicate<String> predicate2 = s->s.contains("Basic");

        List<String> output1 = filterList(chechingfirstnamesholnotbenullpredicate,list);
        output1.forEach(t-> System.out.println(t + "*"));
        long t =output1.stream().count();
        System.out.println(t);

        System.out.println("First end--------------------------");

       /* List<String> output2 = filterList(predicate2,list);
        output2.stream().forEach(System.out::println);

        List<Integer> ints = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> p = integer -> integer%2==0;*/

//        List<Integer> output3 = filterList(p,ints);
//        output3.forEach(r-> System.out.println(r));
//
     }

//    private static <T> List<T> filterList(Predicate<T> predicate, List<T> list) {
//        List<T> result = new ArrayList<>();
//        for (T str:list){
//            if(predicate.test(str)){
//                result.add(str);
//            }
//        }
//        return result;
//    }
    private static  List<String> filterList(Predicate<String> predicate, List<String> list) {
        List<String> result = new ArrayList<>();

        for (String str:list){
            if(predicate.test(str)){
                result.add(str);
            }
        }
        return result;
    }
}
