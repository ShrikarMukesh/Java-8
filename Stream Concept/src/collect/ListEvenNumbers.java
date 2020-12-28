package collect;
import java.util.ArrayList;
import java.util.List;

public class ListEvenNumbers {
	public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<15;i++) {
    	   list.add(i);
       }
      //list = list.stream().filter(i->i%2==0).collect(Collectors.toList());
      //list.forEach(u->System.out.println(u));
       
       list.stream().filter(ref->ref%2 ==0).limit(3).map(i -> i*2).forEach(System.out::println);
	}
}
