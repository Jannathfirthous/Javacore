package p1;

import java.sql.*;

public class MyDBDemo {
	Connection con; // object which holds the connection between our code & database
	String serverAddress = "jdbc:postgresql://localhost:5432/postgres"; // server addressof postgres
	String username = "postgres"; // username
	String password = "pgadmin"; // password

	public MyDBDemo() throws Exception {

		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection(serverAddress, username, password);
		// System.out.println("con "+con);

		// System.out.println("Opened database successfully");
	}

	public static void main(String[] args) {

		try {
			new MyDBDemo().readData();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void readData() throws Exception {
		String query = "select * from Student";
		PreparedStatement ps = con.prepareStatement(query); // statement used for executing the Query

		ResultSet rs = ps.executeQuery(); // statement use for loading the data from DB
		while (rs.next()) {
			int stuid = rs.getInt("roll_no"); // reading data one by one column
			String name = rs.getString("student_name");
			// String name = rs.getString("dept");
			String department = rs.getString("department");

			System.out.println(stuid + " - " + name + " -  " + department);

		}
	}

}
