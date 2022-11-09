package p1;

import java.util.Arrays;
import java.util.*;
//import java.util.jar.Attributes.Name;
//import java.util.stream.Collectors;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MainEmployee app = new MainEmployee();

		Employee e1 = new Employee(101, "a", "New Delhi", 10000);
		Employee e2 = new Employee(102, "b", "Chennai", 3000);
		Employee e3 = new Employee(103, "c", "Banglore", 8000);
		Employee e4 = new Employee(104, "d", "Chennai", 7000);
		Employee e5 = new Employee(105, "e", "Hyderabad", 6000);
		Employee e6 = new Employee(106, "f", "Chennai", 5000);

		List<Employee> allEmployees = Arrays.asList(e1, e2, e3, e4, e5, e6);
		List<Employee> modifiedEmp = new ArrayList<Employee>();
		System.out.println("---------------------List Of All Employees---------------------");
		allEmployees.stream()
		.forEach(allEmp -> System.out.println(allEmp));
		System.out.println(
				"--------------------Task 2 Filter Based on Salary above 5000 and if the location is chennai--------------------");
		
		// increase the salary of Step 2 employee by 11% and Print
		allEmployees.stream()
		.filter(allEmp -> allEmp.getSalary() >= 5000 && allEmp.getLocation().equalsIgnoreCase("Chennai"))
		.forEach((allEmp) -> System.out.println(allEmp));
		System.out.println(" --------------increase the salary of Step 2 employee by 11% and Print -----------------");
		allEmployees.stream()
		.filter(allEmp -> allEmp.getSalary() >= 5000 && allEmp.getLocation().equalsIgnoreCase("Chennai"))
		.forEach(allEmp -> {
			allEmp.setSalary(allEmp.getSalary() + (allEmp.salary*11)/100);
			modifiedEmp.add(allEmp);
		});
		
		System.out.println("task 3 : Store above filtered output in saperate List Employee");
		modifiedEmp.stream()
		.forEach((allEmp) -> System.out.println(allEmp));
	}
}
