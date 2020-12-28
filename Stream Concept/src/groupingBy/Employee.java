package groupingBy;

public class Employee {
	Integer id;
	String name;
	String Address;
	DEPT dept;
	protected Employee() {
		
	}
	
	public Employee(Integer id, String name, String address, DEPT dept) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.dept = dept;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public DEPT getDept() {
		return dept;
	}

	public void setDept(DEPT dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + ", dept=" + dept + "]";
	}
	
	
}
