package Durga.predicate;

import java.util.function.Predicate;

class SoftwareEngineer{
    String name;
    int age;
    boolean isHavingGf;

    public SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class EngineerToPub {
    public static void main(String[] args) {
        SoftwareEngineer[] list ={

                new SoftwareEngineer("Srinivas",26,true),
                new SoftwareEngineer("Jaipal",25,true),
                new SoftwareEngineer("Veeru",28,false),
                new SoftwareEngineer("Shrikar",14,true)
        };
        Predicate<SoftwareEngineer> p = engineer->engineer.age >18 && engineer.isHavingGf;
        System.out.println("Allowed Software Engineers");
        for(SoftwareEngineer se : list){
            if(p.test(se)){
                System.out.println(se);
            }
        }
    }
}
