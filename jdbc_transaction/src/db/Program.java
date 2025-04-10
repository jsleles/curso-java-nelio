package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st    = null;
		
		try {
			conn = DB.getConnetion();
			st = conn.createStatement();
			
			
			conn.setAutoCommit(false);
			
			int rows1 = st.executeUpdate("update seller set basesalary = 2090 where departmentId = 1");

/*
			int i = 1;
			if (i < 2 ) {
				throw new DbException("Fake error");
			}
*/			
			int rows2 = st.executeUpdate("update seller set basesalary = 3090 where departmentId = 2");
			
			conn.commit();
			
			System.out.println("rows1 : " + rows1);
			System.out.println("rows2 : " + rows2);
			
			
		} catch (SQLException e) {
			
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back caused by : " + e.getMessage());
			} catch (SQLException e1) {
                throw new DbException("Error trying to rollback caused by : " + e1.getMessage());
			}
			
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
