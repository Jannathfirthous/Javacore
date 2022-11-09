package p3;

import java.sql.*;

public class KidDb {

	Connection con = DBConnection.con;

	public boolean addKid(Kid k, Parent p) throws Exception {
		String query = " insert into Kid values(?,?,?,?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, k.getId());
		ps.setString(2, k.getGender());
		ps.setString(3, k.getDob());
		ps.setString(4, k.getName());
		ps.setString(5, p.getFatherName());
		ps.setString(6, p.getMotherName());
		ps.setLong(7, p.getPhoneNumber());
		ps.setInt(8, k.getWeight());


		int i = ps.executeUpdate();

		if (i == 1)
			return true;
		else
			return false;
	}
}
