package jdbc_assessment;

import java.sql.Statement;

public class UpdateRecord extends JdbcConnection{
		
	public void updateTable() {
		
		try {
			String updateQuery = "update StudentDetails set Section = 'A' where Id = 2";	
			getConnection();
			Statement st = con.createStatement();
			st.executeUpdate(updateQuery);
			System.out.println("Updated a record in the table.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
