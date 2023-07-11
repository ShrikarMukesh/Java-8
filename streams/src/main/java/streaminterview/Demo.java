package streaminterview;

import java.util.Comparator;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getSampleData();

        //employeeList.stream()
          //      .sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

//        employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getSalary)
//                        .reversed()).
//                limit(2).forEach(System.out::println);

//        employeeList.stream()
//                .distinct().sorted(Comparator.comparing(Employee::getSalary)
//                        .reversed()).
//
//                limit(2).skip(1).forEach(System.out::println);

        employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

//        Map<Integer, List<Employee>> emp = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.toList()));
//
//        System.out.println(emp);

    }

}
