package streams1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String position;
    private String city;
}

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Department {
    private int id;
    private String name;
    private String location;
}

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Organization {
    private String name;
    private String country;
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employeeList = Fixture.getEmployees();


    }
}
