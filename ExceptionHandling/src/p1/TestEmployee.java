package p1;

public class TestEmployee {
	public static void main(String[] args)

	{

		try {
			Employee employee1 = new Employee(101, 5.50);
			System.out.println("Employee ID#: " + employee1.getEmpID() + "\nHourly Wage: " + employee1.getHourlyWage());
		}

		catch (EmployeeException e) {
			System.out.println(e.toString());
		}

		try {
			Employee employee2 = new Employee(102, 30.00);
			System.out.println("Employee ID#: " + employee2.getEmpID() + "\nHourly Wage: " + employee2.getHourlyWage());
		}

		catch (EmployeeException e) {
			System.out.println(e.toString());
		}

		try {
			Employee employee3 = new Employee(103, 60.00);
			System.out.println("Employee ID#: " + employee3.getEmpID() + "\nHourly Wage: " + employee3.getHourlyWage());
		}

		catch (EmployeeException e) {
			System.out.println(e.toString());
		}
	} // end of main() end of main()
} // end of ThrowEmployee class
