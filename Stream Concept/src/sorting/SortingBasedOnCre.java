package sorting;

import java.util.List;
import java.util.Optional;

public class SortingBasedOnCre {
	public static void main(String[] args) {
        List<Employee> allEmp = Employee.listOfEmp();
        Optional<Employee> d = allEmp.stream().findFirst();
        System.out.println(d);
	}
}
