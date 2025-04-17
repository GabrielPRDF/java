package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");
			
//			int x = 1;
//			if (x < 2) {
//				throw new SQLException("Fake");
//			}
			
			int rows2 = st.executeUpdate("update seller set BaseSalary = 3090 where DepartmentId = 2");
			
			
			conn.commit();
			
			System.out.println("Rows 1: " + rows1);
			System.out.println("Rows 2: " + rows2);
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbIntegrityException("Dont transaction, rollback!" + e.getMessage());
			} catch (SQLException e1) {
				throw new DbIntegrityException("Error in rolback!" + e1.getMessage());
			}
			
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
