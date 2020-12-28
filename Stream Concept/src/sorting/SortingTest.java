package sorting;

import java.util.Arrays;
import java.util.List;

public class SortingTest {
	public static void main(String[] args) {
		
       List<String> list = Arrays.asList("Shrikar","K","James","ADCC","Rambo","Anup","Pratap");
       list.forEach(str->System.out.print(str+" "));
       //Collections.sort(list);
       //list.forEach(System.out::println);
       //Collections.sort(list,Comparator.reverseOrder());
       //System.out.println();
       //list.forEach(str->System.out.print(str+" "));
       System.out.println();
       //list.stream().sorted().collect(Collectors.toList()).forEach(d->System.out.println(d));
       //list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
       list.stream().sorted((String name1,String name2)->name1.length() - name2.length()).forEach(System.out::println);
	}
}
