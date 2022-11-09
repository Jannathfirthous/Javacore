package Task;

public class Employee  {

	String name;
	// int salary;
	Payroll payroll;
	//int medicalInsurance;

	public Employee(String name, String designation, int basicSalary, int da, int hra, String name2,
			int medicalInsurance, Payroll payroll) {
		super();
		name = name2;
	
		this.payroll = payroll;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
		// this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub

	}

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", payroll=" + payroll + "]";
	}


	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

	public void login() {
		System.out.println("Enter login Details: ");

	}





}
