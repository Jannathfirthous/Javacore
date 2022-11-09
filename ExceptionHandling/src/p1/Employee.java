package p1;

class Employee {

	private int empID;
	private double hourlyWage;

	// constructor Employee that throws an Exception
	public Employee(int ID, double wage) throws EmployeeException {
		setEmpID(ID);
		setHourlyWage(wage);
	}

	public void setEmpID(int ID) {
		empID = ID;
	}

	public int getEmpID() {
		return empID;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double wage) throws EmployeeException {
		/*
		 * if hourly wage is less then $6.00 per hour then the constructor will throw an
		 * EmployeeException with a message signifying the wage is less then $6.00
		 */
		hourlyWage=wage;
		if (wage < 6.00) {
			String s = "An exception has occured with employee #" + empID
					+ " due to the wage being less then $6.00 per hour \n";
			throw new EmployeeException(s);
		}

		if (wage > 50.00) {
			String s = "An exception has occured with employee #" + empID
					+ " due to the wage being greater then $50.00 per hour \n";
			throw new EmployeeException(s);
		} 
	}
}