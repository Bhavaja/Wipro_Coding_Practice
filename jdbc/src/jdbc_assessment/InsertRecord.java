package jdbc_assessment;

import java.sql.Statement;

public class InsertRecord extends JdbcConnection{
		
	public void insertTable() {
		
		try {
			String createQuery = "create table StudentDetails(Name varchar(20),Id int,Section varchar(10))";
			String insertQuery = 
					"insert into StudentDetails values"
					+ "('Elsa',1,'A'),"
					+ "('Daisy',2,'B'),"		
					+"('Lucy',3,'C')";
			
			getConnection();
			Statement st = con.createStatement();
			st.executeUpdate(createQuery);
			System.out.println("StudentDetails table is created.");
			st.executeUpdate(insertQuery);
			System.out.println("New record is added to the table.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
