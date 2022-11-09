package com.abc.hrapp;

import java.sql.*;

//import java.util.Random;
import java.util.*;

import com.abc.hrapp.entity.Employee;
import com.abc.hrapp.services.EmployeeServiceImpl;
import com.abc.hrapp.services.IEmployeeService;

public class MainApp {
	Scanner sc = new Scanner(System.in);
	Scanner strSc = new Scanner(System.in);

	// Animal a = new Dog();
	IEmployeeService service = new EmployeeServiceImpl();

	public static void main(String[] args) throws Exception {

		MainApp app = new MainApp();

		while (true) {

			System.out.println(" --------- MENU ---------");

			System.out.println("1. Add Employee ");
			System.out.println("2. Get Employee By ID ");
			System.out.println("3. Search Employee By Dept ");
			System.out.println("4. Update Employee  salary ");
			System.out.println("5. Delete Employee ");
			System.out.println("0. EXIT ");

			System.out.println("Enter Choice ");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				app.insertEmployee();
				break;

			case 2:
				app.getEmployeeById();
				break;

			case 3:
				app.searchByDepartment();
				break;

			case 4:
				app.updateSalary();
				break;
			case 5:
				app.deleteEmployee();
				break;
			case 0:
				System.exit(0);
			default:
				break;
			}

		} // end of while

	}// end of main

	public void insertEmployee() {
		System.out.println("Enter Employee Name ");
		String empName = strSc.nextLine();

		System.out.println("Enter Employee Department ");
		String department = strSc.nextLine();

		System.out.println("Enter Employee Salary ");
		int salary = sc.nextInt();

		int id = new Random().nextInt(1000);

		Employee e = new Employee(id, empName, salary, department);
		try {
			boolean status = service.addEmployee(e);

			if (status) {
				System.out.println("INFO :- Employee Added " + e.getEmpId());
			} else {
				System.err.println("WARNING :- Contact to customer care , employee not added");
			}
		} catch (Exception e2) {
			System.err.println("WARNING :- Contact to customer care , employee not added");
			System.out.println(e2);
		}

	} // end insert employee

	public void getEmployeeById() {
		System.out.println("Enter the Employee Id to be Searched :- ");
		int searchId = sc.nextInt();
		try {
			Employee e = service.getEmployeeById(searchId);

			if (e != null)
				printEmployee(e);
			else
				throw new Exception("Employee " + searchId + " Not Found ");

		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public void searchByDepartment() {
		System.out.println("Enter the Employee Department to be Searched :- ");
		String searchDepartmentName = strSc.nextLine();
		try {
			Employee e = service.getEmployeeByDepartment(searchDepartmentName);
			
			if(e != null) printEmployee(e);
			else throw new Exception("Employee "+searchDepartmentName+" Not Found ");
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}

	public void deleteEmployee() {
		System.out.println("Enter the Employee Id to be Delete :- ");
		int searchId = sc.nextInt();
		try {
			System.out.println("Deleted "+ searchId +" Success .....!");
			boolean e = service.deleteEmployee(searchId);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public void updateSalary() {
		
		System.out.println("Enter the Employee Id to be Searched :- ");
		int searchId = sc.nextInt();
		System.out.println("Enter the Employee Salary :- ");
		int newSalary = sc.nextInt();
		try {
			
			Employee e1 = service.getEmployeeById(searchId);
			
			Employee e = service.updateEmployeeSalary(newSalary);
			e.setSalary(newSalary);
			if(e != null) printEmployee(e);
			System.out.println("Employee "+searchId+" Salary  is update successfully.");
		//	else throw new Exception("Employee "+searchId+" is deleted successfully.");
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}
	public void updateDept() {
		
	}

	private void printEmployee(Employee e) {
		System.out.println(e);

	}

	private void printEmp(List<Employee> e1) {
		System.out.println(e1);
	}
}
