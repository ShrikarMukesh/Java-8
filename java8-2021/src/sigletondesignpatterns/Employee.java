package sigletondesignpatterns;

import java.util.Arrays;
import java.util.List;

public class Employee {

   int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }

}
class EmpData{
    public  static List<Employee> data() {

        List<Employee> employees = Arrays.asList(new Employee(101,"Shrikar"),
            new Employee(21,"Mukesh")
        );

        return employees;
    }
}




