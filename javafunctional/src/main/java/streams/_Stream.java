package streams;
import javax.crypto.spec.PSource;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Person.Gender.*;


public class _Stream {
    public static void main(String[] args) {
        List<Person> peoples = List.of(
                new Person("Shrikar", MALE),
                new Person("Anusha",FEMALE),
                new Person("Rohan", MALE),
                new Person("Sindu",FEMALE),
                new Person("Vijay",MALE),
                new Person("Shiva",MALE),
                new Person("Sharon",FEMALE),
                new Person("Bob",PREFER_NOT_SAY),
                new Person("Mahesh", MALE)
        );
        // peoples.stream().map(person -> person.name).mapToInt(String::length).forEach(System.out::println);
        Predicate<Person> personPredicate = person -> PREFER_NOT_SAY.equals(person.gender);
        boolean containsOnlyFemales = peoples.stream().anyMatch(personPredicate);
        System.out.println(containsOnlyFemales);

    }
    static class Person{

        private final String name;
        private final Gender gender;

        Person(String name, Person.Gender gender) {
            this.name = name;
            this.gender =gender;
        }
        enum Gender{
            MALE,FEMALE,PREFER_NOT_SAY;
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
