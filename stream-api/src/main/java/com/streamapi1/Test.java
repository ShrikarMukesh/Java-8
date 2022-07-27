package com.streamapi1;

import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees  =  Employee.getEmployees();
        //employees.stream().sorted(Comparator.comparing(employee -> employee.getFirstName())).forEach(System.out::println);
        employees.stream().anyMatch( employee ->  employee.getFirstName().startsWith("A"));
    }
}
