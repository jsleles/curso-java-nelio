package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st   = null;
		
		try {
			conn = DB.getConnetion();
			st = conn.prepareStatement("update seller "
					                  + " set BaseSalary = BaseSalary + ? "
					                  + " WHERE " 
					                  + " ( DepartmentId = ? )"
				                      );
		    st.setDouble(1, 200.0);
			st.setInt(2, 2);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Done! rows Affected : " + rowsAffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
