package com.abc.hrapp.dao;

import java.sql.*;

import java.util.*;
import com.abc.hrapp.entity.*;

public class EmployeeDAOImpl implements IEmployeeDAO {
	Connection con = DBConnection.con;

	@Override
	public boolean addEmployee(Employee e) throws Exception {
		String query = " insert into employee values(?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, e.getEmpId());
		ps.setString(2, e.getEmpname());
		ps.setInt(3, e.getSalary());
		ps.setString(4, e.getDepartment());

		int i = ps.executeUpdate();

		if (i == 1)
			return true;
		else
			return false;
	}

	public Employee getEmployeeById(int searchId) throws Exception {
		String query = "select * from Employee where empid = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, searchId);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("empid");
			String name = rs.getString("empname");
			int salary = rs.getInt("salary");
			String dept = rs.getString("department");

			Employee e = new Employee(id, name, salary, dept);
			return e;
		}

		return null;
	}

	@Override
	public Employee getEmployeeByDepartment(String searchDepartmentName) throws Exception {
		String query = "select * from Employee where department = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, searchDepartmentName);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			int id = rs.getInt("empid");
			String name= rs.getString("empname");
			int salary = rs.getInt("salary");
			String dept= rs.getString("department");
			
			Employee e = new Employee(id, name, salary, dept);
		return e;
	}

		return null;
	}


	@Override
	public boolean deleteEmployee(int searchId) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println(searchId);
		String query = "DELETE FROM Employee WHERE empid=?";

		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, searchId);
		ResultSet rs = statement.executeQuery();

		System.out.println(rs);

		return false;
	}

	@Override
	public Employee updateEmployeeSalary(int searchId) throws Exception {

		String query = "update emp set salary = ? where id = ?";
		PreparedStatement stmt = con.prepareStatement(query);
		Employee e = new Employee();
		stmt.setInt(1, e.getSalary());
		stmt.setInt(2, searchId);
		stmt.execute(query);

		ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
		System.out.println("id  name    job");
		int i = stmt.executeUpdate();

		while (rs.next()) {
			int id = rs.getInt("empid");
			String name = rs.getString("empname");
			int salary = rs.getInt("salary");
			String dept = rs.getString("department");
			System.out.println(id + "   " + name + "    " + salary+"   "+dept+"   ");
		}
		return null;

	}

	@Override
	public boolean updateEmployeeSalary(String department) {
		// TODO Auto-generated method stub
		return false;
	}

}
