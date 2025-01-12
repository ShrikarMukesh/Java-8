package streams1;

import java.util.Arrays;
import java.util.List;

public class Fixture {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("Alice", 45, 80000, "Manager", "New York"),
                new Employee("Bob", 50, 70000, "Developer", "San Francisco"),
                new Employee("Charlie", 35, 90000, "Architect", "Chicago"),
                new Employee("David", 42, 75000, "Developer", "Boston"),
                new Employee("Eve", 46, 80000, "Manager", "Seattle"),
                new Employee("Frank", 39, 85000, "Designer", "Austin"),
                new Employee("Grace", 28, 72000, "Tester", "Denver"),
                new Employee("Hank", 55, 95000, "Director", "Dallas"),
                new Employee("Ivy", 31, 60000, "Support Engineer", "Orlando"),
                new Employee("Jack", 40, 78000, "System Analyst", "Phoenix")
        );
    }

    public static List<Department> getDepartments() {
        return Arrays.asList(
                new Department("IT", "Headquarters", getEmployees().subList(0, 3)),
                new Department("HR", "Branch Office", getEmployees().subList(3, 5)),
                new Department("Design", "Creative Hub", getEmployees().subList(5, 7)),
                new Department("Management", "Corporate", getEmployees().subList(7, 9)),
                new Department("Support", "Remote Office", getEmployees().subList(9, 10))
        );
    }

    public static Organization getOrganization() {
        return new Organization("TechCorp", "USA", getDepartments());
    }
}
