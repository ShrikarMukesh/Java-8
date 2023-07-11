package streaminterview;

import lombok.*;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ToString
@AllArgsConstructor
@Setter
@Getter
//@Data
class Employee1{
    int id;
    String firstName;
    String lastName;
    int salary;
}
public class Test1 {
    public static void main(String[] args) {

        Employee1 employee1 = new Employee1(1,"Shrikar", "Mukesh" ,1000);
        Employee1 employee99 = new Employee1(1,"Shrikar", "Mukesh" ,1000);
        Employee1 employee2 = new Employee1(2,"Karthik", "J" ,2000);
        Employee1 employee3 = new Employee1(3,"Dinesh", "Kumar" ,3000);
        Employee1 employee4 = new Employee1(4,"Arun", "JJJ" ,11000);

        Set<Employee1> employee1Set = new HashSet<>();

        employee1Set.add(employee1);employee1Set.add(employee2);employee1Set.add(employee3); employee1Set.add(employee4);
        employee1Set.add(employee99);

    }
}
