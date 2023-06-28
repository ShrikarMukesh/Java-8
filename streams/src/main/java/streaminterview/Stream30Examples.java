package streaminterview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream30Examples {
    public static void main(String[] args) {

        List<Employee> employees  = Employee.getSampleData();

        //Filtering employees by age: 30
        List<Employee> employees30 = employees.stream().filter(employee -> employee.getAge() >30).collect(Collectors.toList());
        System.out.println(employees30);

        //Mapping employees to their names:
        List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());

        //Summing the salaries of all employees:
        long salarySum = employees.stream().mapToLong(Employee::getSalary).sum();
        System.out.println("Salary Sum " + salarySum);
        System.out.println(" Counting the number of employees:"+employees.stream().count());

        // Employee having max salary
        Employee employeeHighSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(employeeHighSalary);

        //Finding the highest salary among employees:
        Optional<Integer> maxSalary = employees.stream()
                .map(Employee::getSalary)
                .max(Integer::compareTo);
        System.out.println(maxSalary.get());

        //Find HRs
        List<Employee> hrs = employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("HR")).collect(Collectors.toList());

        //Java Skilled Employees
        List<Employee> javaEmployees = employees.stream()
                .filter(employee -> employee.getSkills().contains("Java")).collect(Collectors.toList());
        System.out.println(javaEmployees);

        //Sorting employees by name:
        List<Employee> sortEmployee = employees.stream().sorted( Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println(sortEmployee);

        // Skipping the first three employees
        List<Employee> only3Emp = employees.stream().skip(3).collect(Collectors.toList());
        System.out.println("only3Emp "+  only3Emp);

        //Limiting the stream to the first five employees:
        List<Employee> limited = employees.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Limited 5 " + limited);

        //Checking if all employees are active:
        boolean allActive = employees.stream()
                .allMatch(Employee::isActive);
        System.out.println("All Active" + allActive);

        //Finding the employee with the highest salary:
       Employee employeeMaxSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
        System.out.println("Finding the employee with the highest salary" + employeeMaxSalary);

        Optional<Employee> highestSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        //Removing duplicate employees:
        List<Employee> distinctEmployees = employees.stream()
                .distinct()
                .collect(Collectors.toList());

        //Grouping employees by department:
        Map<String, List<Employee>> employees1  = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        employees1.entrySet().stream().forEach(System.out::println);

        //Checking if any employee has a specific skill:
        boolean hasSkill = employees.stream()
                .anyMatch(e -> e.getSkills().contains("Java"));

        //Calculating the average age of employees:
        double averageAge = employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);
        System.out.println("averageAge "+ averageAge);

        //Collecting employees into a map with ID as the key:
        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity()));

        System.out.println("Collecting employees into a map with ID as the key:" + employeeMap);

        //Finding the first employee in the stream:
        Optional<Employee> firstEmployee = employees.stream()
                .findFirst();

        //Checking if all employees have unique IDs:
        boolean allUniqueIds = employees.stream()
                .map(Employee::getId)
                .distinct()
                .count() == employees.size();

        //Second max salary
        Employee employee = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second max salary" + employee);

    }
}
