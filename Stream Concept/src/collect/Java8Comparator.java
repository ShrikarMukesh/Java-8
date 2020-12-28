package collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private long salary;
	private Gender gender;

	public Employee(int id, String firstName, String lastName, int age, long salary,Gender gender) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(int id, String firstName, String lastName, int age){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", salary=" + salary + "]";
	}



}

public class Java8Comparator {

	public static void main(String[] args) {

		List<Employee> employees  = getEmployees();
		//System.out.println(employees);

		//Sort all employees by first name
		//employees.sort(Comparator.comparing(e -> e.getFirstName()));
		
		employees.sort(Comparator.comparing(e -> e.getId()));
		//OR you can use below
		employees.sort(Comparator.comparing(Employee::getFirstName));

		//Let's print the sorted list
		System.out.println(employees);
		
		List<Employee> outcome= listOfEmployess().stream().filter(ref-> ref.getGender() == Gender.MALE).collect(Collectors.toList());
		outcome.forEach(System.out::println);

	}
	private static List<Employee> getEmployees(){

		List<Employee> employees  = new ArrayList<>();

		employees.add(new Employee(6,"Yash", "Chopra", 25));
		employees.add(new Employee(2,"Aman", "Sharma", 28));
		employees.add(new Employee(3,"Aakash", "Yaadav", 52));
		employees.add(new Employee(5,"David", "Kameron", 19));
		employees.add(new Employee(4,"James", "Hedge", 72));
		employees.add(new Employee(8,"Balaji", "Subbu", 88));
		employees.add(new Employee(7,"Karan", "Johar", 59));
		employees.add(new Employee(1,"Lokesh", "Gupta", 32));
		employees.add(new Employee(9,"Vishu", "Bissi", 33));
		employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));

		return employees;
	}
	private static List<Employee> listOfEmployess(){

		List<Employee> employees  = new ArrayList<>();

		employees.add(new Employee(1,"Ambrish", "P", 25, 29898,Gender.MALE));
		employees.add(new Employee(2,"Dinesh", "Vitthal", 33, 87899,Gender.FEMALE));
		employees.add(new Employee(5,"Anup", "Sinha", 60,2676,Gender.MALE));

		return employees;
	}

}
enum Gender{
	MALE,FEMALE,OTHERS;
}
