package Task;

public class HrDetails extends Payroll {

	String employeeStartDate;
	String employeeBank;
	String employeeLocation;
	Employee emp;

	public HrDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeStartDate() {
		return employeeStartDate;
	}

	public void setEmployeeStartDate(String employeeStartDate) {
		this.employeeStartDate = employeeStartDate;
	}

	public String getEmployeeBank() {
		return employeeBank;
	}

	public void setEmployeeBank(String employeeBank) {
		this.employeeBank = employeeBank;
	}

	public String getemployeeLocation() {
		return employeeLocation;
	}

	public void setemployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	/*
	 * @Override public String toString() { return "HrDetails [employeeStartDate=" +
	 * employeeStartDate + ", employeeBank=" + employeeBank + ", employeeLocation="
	 * + employeeLocation + "]"; }
	 */

	public HrDetails(String name, String employeeStartDate, String employeeBank, String employeeLocation) {
		this.employeeStartDate = employeeStartDate;
		this.employeeBank = employeeBank;
		this.employeeLocation = employeeLocation;
	}

	@Override

	public void setBasicSalary(int incentive) {
		super.setBasicSalary(super.getBasicSalary() + incentive);

	}
	@Override
	public void setMedicalInsurance(int medicalInsurance)
	{
		
		super.setMedicalInsurance(super.getBasicSalary()+(getBasicSalary()*100));
		
		
	}

	public void hiringRecords() {
		System.out.println("Employee Start date " + employeeStartDate);
		System.out.println("Employee Salary Account is " + employeeBank);
		System.out.println("Employee Working Location is " + employeeLocation);
	}

}
