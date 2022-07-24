package functionalInterfaces;

@FunctionalInterface
interface FunctionalGeneric<T,R>{
    //T is the generic type and R is the return type
     R execute(T t);
}
public class FunctionalGenerics {
    public static void main(String[] args) {
        FunctionalGeneric<String,String> generic = s -> s.toLowerCase();
        String demo = generic.execute("SHRIKAR");
        System.out.println(demo);

        FunctionalGeneric<String,Integer> generic2 = s -> s.length();
        System.out.println(generic2.execute("Mukesh"));
    }
}
