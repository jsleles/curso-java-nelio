package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			
			conn = DB.getConnetion();
			st = conn.prepareStatement(
					"insert into seller " +
			        "(name, email, birthdate, baseSalary, departmentId) " +
					"Values (?, ?, ?, ?, ?)" , PreparedStatement.RETURN_GENERATED_KEYS
					);
			
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.00);
			st.setInt(5, 4);
			
			int rowsAffected = st.executeUpdate();
         			
 		    if (rowsAffected > 0) {
 		    	rs = st.getGeneratedKeys();
 		    	while (rs.next()) {
 		    		int id = rs.getInt(1);
 		    		System.out.println("Done! id = " + id);
 		    	}
 		    	
 		    } else {
 		    	System.out.println("No rows affected");
 		    }
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResutSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
