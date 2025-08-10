package jdbc_assessment;

import java.sql.Statement;

public class DeleteRecord extends JdbcConnection{
		
	public void deleteTable() {
		
		try {
			String deleteQuery = "delete from StudentDetails where Id = 3";	
			getConnection();
			Statement st = con.createStatement();
			st.executeUpdate(deleteQuery);
			System.out.println("Deleted a record from the table.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}


}
