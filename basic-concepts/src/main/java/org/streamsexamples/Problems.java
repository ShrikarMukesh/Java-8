package org.streamsexamples;

import java.util.*;
import java.util.stream.Collectors;
//https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
public class Problems {
    public static void main(String[] args) {
        //Q1: How many male and female employees are there in the organization?
        List<Employee> employees = Employee.employees();
        Map<String, Long> noOfMaleAndFemaleEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        //System.out.println(noOfMaleAndFemaleEmployees);
        /*
          Q2: Print the name of all departments in the organization?
        */
        //employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        //Query 3.3 : What is the average age of male and female employees?
        Map<String, Double> avgAgeOfMaleAndFemaleEmployees
                = employees.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployees);

        //Query 3.4 : Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidEmployeeWrapper = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(highestPaidEmployeeWrapper);

        //Query 3.5 : Get the names of all employees who have joined after 2015?
        //employees.stream().filter(emp->emp.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        //Query 3.6 : Count the number of employees in each department?
        Map<String, Long> emps = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(emps);

        //Query 3.7 : What is the average salary of each department?
        Map<String, Double> avgSalaryOfDepartments =
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Query 3.8 : Get the details of youngest male employee in the product development department?
    }
}
