package jdbc_assessment;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	Connection con = null;
	
	public Connection getConnection() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/sql_jdbc_database";
			String username = "root";
			String password = "Bhavaja@02";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
