package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
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
					"INSERT INTO seller " +
					"(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
					"VALUES " +
					"(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS
					);
//			Caso queira inserir mais de um dado
//			st = conn.prepareStatement("insert into department (Name) values ('d1'), ('d2')");
			st.setString(1, "Gabriel Ribeiro");
			st.setString(2, "gabrielprdf1@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/03/1995").getTime()));
			st.setDouble(4, 3500.00);
			st.setInt(5, 4);
			int rowsAffected = st.executeUpdate();
			System.out.println("Linhas alteradas: " + rowsAffected);
			if (rowsAffected > 0) {
				ResultSet rs2 = st.getGeneratedKeys();
				while (rs2.next()) {
					int id = rs2.getInt(1);
					System.out.println("ID creado: " + id);
				}
				DB.closeResultSet(rs2);
			}
			
			rs = st.executeQuery("select * from seller");
			//Modo a percorrer a lista sem retorno da alteracao
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
