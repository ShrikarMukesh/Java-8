package predicate;

import java.util.function.Predicate;

public class SartsWith_K {
    public static void main(String[] args) {

        String[] names = {"Karim","Bale","Valverde","Kante","Kroos"};
        Predicate<String> startsWithK = name -> name.charAt(0) =='K';
        for(String s:names){
            if(startsWithK.test(s)){
                System.out.println(s);
            }
        }
    }
}
