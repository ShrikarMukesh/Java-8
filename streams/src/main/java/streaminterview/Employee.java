package streaminterview;


import lombok.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private int id;
    private String name;
    private int age;
    private String department;
    private int salary;
    private boolean isActive;
    private List<String> skills;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static List<Employee> getSampleData() {
         List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", 30, "IT", 90300, true, Arrays.asList("Java", "SQL")),
                 new Employee(1, "John", 30, "IT", 90300, true, Arrays.asList("Java", "SQL")),
                new Employee(1, "Jane Smith", 35, "HR", 85300, true, Arrays.asList("Communication", "Problem Solving")),
                new Employee(3, "Mike Johnson", 28, "Finance", 85300, true, Arrays.asList("Accounting", "Excel")),
                new Employee(4, "Emily Davis", 32, "Sales", 4000, false, Arrays.asList("Negotiation", "Presentation")),
                new Employee(5, "David Wilson", 27, "IT", 4800, true, Arrays.asList("Python", "Database")),
                new Employee(6, "Sarah Brown", 33, "Finance", 5200, true, Arrays.asList("Financial Analysis", "Budgeting")),
                new Employee(7, "Michael Lee", 31, "HR", 4200, true, Arrays.asList("Recruitment", "Employee Relations")),
                new Employee(8, "Dinesh", 29, "Sales", 43500, true, Arrays.asList("Java", "Microservices")),
                new Employee(9, "Kumar", 49, "Manager", 85300, true, Arrays.asList("Python", "Networking")),
                new Employee(10, "Shrikar ", 39, "Manager", 90300, true, Arrays.asList("React", "Networking"))
        );

        return employees;
    }
}
