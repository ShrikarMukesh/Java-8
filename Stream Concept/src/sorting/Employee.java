package sorting;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	int id;
	String name;
	long marks;
	String Address;
	public Employee() {

	}

	public Employee(int id, String name, long marks, String address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + ", Address=" + Address + "]";
	}
	public static List<Employee> listOfEmp(){
		
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(23,"Arun",34,"Kalburgi");
		Employee emp2 = new Employee(73,"Rohan",9,"Banglore");
		Employee emp3 = new Employee(3,"Smitha",49,"Raichur");
		Employee emp4 = new Employee(29,"Vijay",8,"Mandy");
		Employee emp5 = new Employee(64,"Dinesh",80,"Kalburgi");
		Employee emp6 = new Employee(4,"Sindhu",80,"Mandy");
		list.add(emp1);list.add(emp2);list.add(emp3);list.add(emp4);list.add(emp5);list.add(emp6);
		return list;
		
	}
}
