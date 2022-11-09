package Task;

public class Payroll extends Employee {
	String designation;
	int basicSalary;
	int da;
	int hra;
	Employee employee;
	int medicalInsurance;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public Payroll(String name, String designation, int basicSalary, int da, int hra) {
		this.designation = designation;
		this.basicSalary = basicSalary;
		this.da = da;
		this.hra = hra;
	}

	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void payDetails() {
		System.out.println("Designation : " + designation);
		System.out.println("Basic pay of employee is " + basicSalary);
		System.out.println("Dearness Allowance is " + da);
		System.out.println("House rent allowance is " + hra);
		int incentive = basicSalary + 1000;
		System.out.println("Incentive is " + incentive);
	}

	public int getMedicalInsurance() {
		return medicalInsurance;
	}

	public void setMedicalInsurance(int medicalInsurance) {
		// TODO Auto-generated method stub
		
	}

	public void setSalary(int incentive) {
		// TODO Auto-generated method stub
		
	}

}
