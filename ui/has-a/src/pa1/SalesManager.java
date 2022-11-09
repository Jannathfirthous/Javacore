package pa1;

public class SalesManager extends Employee {

	int target;

	public SalesManager() {
		super();

	}

	public SalesManager(String name, int salary, int target, int medicalInsurance) {
		super(name, salary, medicalInsurance);
		this.target = target;
	}

	public int target() {
		return target;
	}

	public void setFileTarget(int target) {
		this.target = target;
	}

	public void worksOnGrowth() {
		// System.out.println(name);
		System.out.println("Target of " + name + " is " + target);
		// System.out.println(salary);

	}

	@Override
	public void setSalary(int incentive) {
		System.out.println("salary with incentive is");
		super.setSalary(super.getSalary() + incentive);

	}

	@Override
	public void setMedicalInsurance(int medicalInsurance) {
		System.out.println("Medical insurance is ");

		super.setMedicalInsurance(super.getSalary() + (getSalary() * 100));

	}

}
