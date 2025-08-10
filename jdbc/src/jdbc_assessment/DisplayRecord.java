package jdbc_assessment;

import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecord extends JdbcConnection{
		
	public void displayTable() {
		
		try {
			String selectQuery = "select * from StudentDetails";	
			getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(selectQuery);
			while(rs.next()) {
				System.out.println("Name: "+rs.getString("Name")+" , Id: "+rs.getInt("Id")+" , Section: "+rs.getString("Section"));
			}
			st.close();
			con.close();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
