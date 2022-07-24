package imperative;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Person.Gender.FEMALE;
import static imperative.Main.Person.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> peoples = List.of(
                new Person("Shrikar", Person.Gender.MALE),
                new Person("Anusha",FEMALE),
                new Person("Rohan",Person.Gender.MALE),
                new Person("Sindu",FEMALE),
                new Person("Vijay",MALE),
                new Person("Shiva",MALE),
                new Person("Sharon",FEMALE)
        );
        //Imperative approach
        List<Person> females =new  ArrayList<>();
        for(Person person:peoples){
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for(Person female:females){
            System.out.println(female);
        }
        List<Person> males = new ArrayList<>();
        for(Person person : peoples){
            if(MALE.equals(person.gender)){
                males.add(person);
            }
        }
        for(Person male: males){
            System.out.println(male);
        }
        //Declarative approach
        System.out.println("This is Declarative approach");
        peoples.stream().filter(person -> MALE.equals(person.gender)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Without collect method");
        peoples.stream().filter(person -> MALE.equals(person.gender)).forEach(System.out::println);

        System.out.println("Predicate usage");
        Predicate<Person> predicate = person -> FEMALE.equals(person.gender);
        peoples.stream().filter(predicate).forEach(System.out::println);

    }
    static class Person{

        private final String name;
        private final Gender gender;

        Person(String name,Gender gender) {
            this.name = name;
            this.gender =gender;
        }
        enum Gender{
            MALE,FEMALE;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

}
