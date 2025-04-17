package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"Update seller " +
					"set BaseSalary = BaseSalary + ? " + 
					"Where " + 
					"(DepartmentId = ?)"
					);
			st.setDouble(1, 200.00);
			st.setInt(2, 2);
			int rowsAffected = st.executeUpdate();
			System.out.println("Linhas alteradas: " + rowsAffected);
			rs = st.executeQuery("select * from seller");
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " 
						+ rs.getString("Name") + ", "
//						+ rs.getString("Email") + ", "
//						+ rs.getDate("BirthDate") + ", "
						+ rs.getDouble("BaseSalary") + ", "
						+ rs.getInt("DepartmentId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
