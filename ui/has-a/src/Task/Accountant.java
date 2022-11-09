package Task;

public class Accountant extends Employee {
	String fileName;
	Payroll payroll;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Accountant(String name, String fileName, Payroll payroll) {
		super(name);
		this.fileName = fileName;
		this.payroll = payroll;
	}

	public Accountant(String name, String fileName) {
		this.fileName = fileName;
	}

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

	@Override
	public String toString() {
		return "Accountant [fileName=" + fileName + "]";
	}

	public void worksOnTax() {
		System.out.println("Name of the Employee is " + name);
		System.out.println("Filename of the employee is " + fileName);
	}

}
