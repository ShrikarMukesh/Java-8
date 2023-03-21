package com.streamapi1;

import java.util.*;
import java.util.stream.Collectors;
/*
   collect, reduce, forEach, anyMatch, allMatch, noneMatch, count, min, max
 */
public class TerminalOperators {
    public static void main(String[] args) {

        List<Employee> employees = Employee.getEmployees();
        List<String> id = Arrays.asList("Classes","Methods","Members");

        //Java 8
       List<String> names = employees.stream().map(Employee::getFirstName).filter(s->s.startsWith("S")).toList();
        System.out.println(names);

//        //Java 16
//        List<String> output2 = id.stream().filter(s -> s.startsWith("M")).toList();
//        System.out.println(output2);
//
//        //allMatch
//        boolean areAllMale = employees.stream().anyMatch(employee -> employee.getGender().equals(Gender.MALE));
//        System.out.println(areAllMale);
//
//        //anyMatch
//        boolean anyMatch  = employees.stream().anyMatch(employee -> employee.getFirstName().startsWith("A"));
//        System.out.println(anyMatch);
//
//        //noneMatch
//        boolean bangalore = employees.stream()
//                .noneMatch(p -> p.getAddress().endsWith("lore"));
//        System.out.println(bangalore);
//
//        //count
//        long count = employees.stream().filter(employee -> employee.getGender().equals(Gender.FEMALE)).count();
//        System.out.println(count);
//
//        //forEach
//        //employees.stream().filter(employee -> employee.getGender().equals(Gender.MALE)).forEach(System.out::println);
//
//        //min
//        Optional<Employee> min = employees.stream()
//                .filter(p -> p.getGender().equals(Gender.FEMALE))
//                .min((p1, p2) -> p1.getAge() - p2.getAge());
//        if (min.isPresent()) {
//            Employee youngestGirl = min.get();
//            System.out.println("The youngest girl is: "
//                    + youngestGirl + " (" + youngestGirl.getAge() + ")");
//        }
//
//        //max
//        Optional<Employee> agedmale = employees.stream().filter(employee -> employee.getGender().equals(Gender.MALE))
//                .max((emp1,emp2) -> emp1.getAge() - emp2.getAge());
//
//        if(agedmale.isPresent()){
//            Employee agedMan = agedmale.get();
//            System.out.println("The Old Man"+ agedMan);
//        }
//        //reduce
//        int[] numbers = {123, 456, 789, 246, 135, 802, 791};
//        int sum = Arrays.stream(numbers).reduce(0, (x, y) -> (x + y));
//        System.out.println("sum = " + sum);
    }
}
