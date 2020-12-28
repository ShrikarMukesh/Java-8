package groupingBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Sorting implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {

		return (o1.getId()).compareTo(o2.getId());
	}

}
public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1 = new Employee(71,"Rohan","Blore",DEPT.JAVA);
		Employee emp2 = new Employee(82,"Abhishek","Odisha",DEPT.BI);
		Employee emp3 = new Employee(45,"Shrikar","Klbg",DEPT.JAVA);
		Employee emp4 = new Employee(54,"Anusha","Sandoor",DEPT.JAVA);
		Employee emp5 = new Employee(74,"Sharon","Andhra",DEPT.HR);
		Employee emp6 = new Employee(14,"Balaji","TamilNadu",DEPT.MANAGER);
		Employee emp7 = new Employee(34,"Vijay","Amdya",DEPT.JAVA);
		Employee emp8 = new Employee(4,"Manju","Blore",DEPT.BI);

		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();

		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);
		listOfEmployees.add(emp5);
		listOfEmployees.add(emp6);
		listOfEmployees.add(emp7);
		listOfEmployees.add(emp8);
		System.out.println(listOfEmployees);

		Collections.sort(listOfEmployees,new Sorting());
		System.out.println(listOfEmployees);
		
	}
}
