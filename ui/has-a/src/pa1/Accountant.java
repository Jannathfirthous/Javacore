package pa1;

public class Accountant extends Employee {
	String fileName;

	public Accountant() {
		super();

	}

	public Accountant(String name, int salary, String fileName, int medicalInsurance) {
		super(name, salary, medicalInsurance);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void worksOnTaxFile() {
		System.out.println("Name of the employee :" + name);
		System.out.println("File Name of employee: " + fileName);
		System.out.println("Salary of Employee is : " + salary);
		// System.out.println("Medical insurance of employee is : "+medicalInsurance);

	}

	@Override
	public String toString() {
		return "Accountant [fileName=" + fileName + "]";
	}

	@Override
	public void setMedicalInsurance(int medicalInsurance) {

		super.setMedicalInsurance(super.getSalary() + (getSalary() * 10));

	}
}
