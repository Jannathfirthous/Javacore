package com.abc.hrapp.dao;

import java.util.List;

import com.abc.hrapp.entity.Employee;

public interface IEmployeeDAO {
	public boolean addEmployee(Employee e) throws Exception ;// method to add Employee in DB
	public Employee getEmployeeById(int searchId)throws Exception ;
	public Employee getEmployeeByDepartment(String searchDepartmentName) throws Exception;
	public boolean deleteEmployee(int searchId) throws Exception;
	public Employee updateEmployeeSalary(int searchId) throws Exception;
	public boolean updateEmployeeSalary(String department);
}
