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
			st = conn.prepareStatement(
                    "delete from department "
					+ " WHERE "
					+ " ( Id = ? )"
				                      );
			st.setInt(1, 2);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Done! rows Affected : " + rowsAffected);
			
		} catch (SQLException e) {
			throw new DbIntegratyException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
