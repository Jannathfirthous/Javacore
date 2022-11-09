package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
	ArrayList<Employee> allEmployees = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);

	
	public static void main(String[] args) {

		/*
		 * call business methods based on user inputs
		 */
		

		EmployeeList el = new EmployeeList();
		el.addEmployee();
		el.printAllEmployees();
		el.getEmployeeById();
	}

	public void addEmployee()
	{
		Employee e = new Employee("mike", 100, 2000); 
		/*System.out.println("Enter employee Id:");
		
		int em=sc.nextInt();
		System.out.println("Enter employee Name:");
		String name=scStr.nextLine();
		System.out.println("Enter Salary");
		int sal=sc.nextInt();*/

		Employee e1 = new Employee("mike", 100, 2000); // get all details from user
		Employee e2 = new Employee("Jan", 102, 4000);
		// code to add employee in collection (allEmployee)
		ArrayList<Employee> mylist = new ArrayList<Employee>();
		 mylist.add(e);
		mylist.add(e1);
		mylist.add(e2);
		
		allEmployees.add(e);
		allEmployees.add(e1);
        allEmployees.add(e2);
		//System.out.println(mylist);
	}

	public void printAllEmployees() {
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}

	public void getEmployeeById() {
		boolean isFound = false;
		System.out.println("Enter the Id to be searched ");
		int searchedId = 101; // sc.nextInt();
		for (Employee employee : allEmployees) {
			if (employee.getId() == searchedId) {
				// employee found
				isFound = true;
				System.out.println(employee);
			}
		}

		if (!isFound) {
			// means employee not in the list
			System.out.println(searchedId + "  employee id is not in the list");
		}
	}

}

/*
 * Student Account Dog Animal Insurance Policy Book LinkedProfile Video
 * 
 * 
 */
