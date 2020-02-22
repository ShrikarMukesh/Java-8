package Durga.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullValues {
    public static void main(String[] args) {
        String[] names = {"Karim",null,"Bale","","","Valverde",null,"Kroos",""};
        Predicate<String> p = s ->s!=null && s.length() !=0;
        ArrayList<String> al = new ArrayList<>();
        for(String s :names){
            if(p.test(s)){
                al.add(s);
            }
        }
        System.out.println(al);
    }
}
