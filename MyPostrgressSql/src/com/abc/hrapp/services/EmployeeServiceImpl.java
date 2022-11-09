package com.abc.hrapp.services;

import java.util.*;

import com.abc.hrapp.dao.EmployeeDAOImpl;
import com.abc.hrapp.dao.IEmployeeDAO;
import com.abc.hrapp.entity.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	IEmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	public boolean addEmployee(Employee e) throws Exception {
		/*
		 * consist all code to 1. validate employee 2. security 3. adding log files ---
		 * SKIP ----
		 */

		return dao.addEmployee(e);
	}

	@Override
	public Employee getEmployeeById(int searchId) throws Exception {

		/* --- skip other code ---- */
		return dao.getEmployeeById(searchId);
	}

	@Override
	public List<Employee> getEmployeeByDepartment(String searchDepartmentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(int searchId) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(searchId);
	}

	@Override
	public Employee updateEmployeeSalary(int searchId) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateEmployeeSalary(searchId);
	}

	@Override
	public boolean updateEmployeeSalary(String department) throws Exception{
		// TODO Auto-generated method stub
		return dao.getEmployeeByDepartment(department);
	}
}
