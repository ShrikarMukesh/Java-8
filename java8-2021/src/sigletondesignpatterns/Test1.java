package sigletondesignpatterns;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Test1 {
    public static void main(String[] args) {
        List<Employee> data = EmpData.data();
        System.out.println(data);

       // data.stream().sorted((emp1,emp2)->)
        List<Employee> result = data.stream().sorted(Comparator.comparing(Employee::getName,
                (emp1,emp2)->{
                  return  emp1.compareTo(emp2);
        })).collect(Collectors.toList());


        result.forEach(employee -> System.out.println(employee));

    }
}
