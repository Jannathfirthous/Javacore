package com.abc.hrapp.dao;

import java.sql.*;

public class DBConnection {
	public static Connection con; // object which holds the connection between our code & database

	static {
		String serverAddress = "jdbc:postgresql://localhost:5432/postgres"; // server addressof postgres
		String username = "postgres"; // username
		String password = "pgadmin"; // password

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(serverAddress, username, password);
		} catch (Exception e) {
			System.err.println("ERROR :- " + e);
		}

	}
}
