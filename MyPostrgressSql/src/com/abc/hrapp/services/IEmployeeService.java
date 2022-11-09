package com.abc.hrapp.services;

import java.util.List;

import com.abc.hrapp.entity.Employee;

public interface IEmployeeService {
	public boolean addEmployee(Employee e) throws Exception; // method to add Employee in DB

	public Employee getEmployeeById(int searchId) throws Exception;

	public Employee getEmployeeByDepartment(String searchDepartmentName);

	public boolean deleteEmployee(int searchId) throws Exception;

	public Employee updateEmployeeSalary(int searchId) throws Exception;

	public boolean updateEmployeeSalary(String department) throws Exception;

}
