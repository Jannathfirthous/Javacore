package p1;

public class Employee {
	int Employeeid;
	String Name;
	String location;
	int salary;
	
	
	
	public Employee(int employeeid, String name, String location, int salary) {
		super();
		Employeeid = employeeid;
		Name = name;
		this.location = location;
		this.salary = salary;
	}
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Employeeid=" + Employeeid + ", Name=" + Name + ", location=" + location + ", salary=" + salary
				+ "]";
	}

		
		
		
}
