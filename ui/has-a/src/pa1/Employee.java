package pa1;

public class Employee {
	String name;
	int salary;
	int medicalInsurance;


	public Employee() {
		super();
	}
	

	
	public Employee(String name, int salary, int medicalInsurance) {
		super();
		this.name = name;
		this.salary = salary;
		this.medicalInsurance = medicalInsurance;
	}


	public int getMedicalInsurance() {
		return medicalInsurance;
	}
	public void setMedicalInsurance(int medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	void Login()
	{
		
		System.out.println("Enter the name:");
		
	}


}
